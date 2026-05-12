package Unidad_3.Practica_2;

import javax.swing.*;

public class MainLibro {
    public static void main(String[] args) {
        Libro libro = null;
        int el = 0;
        do {
            String input = pDat("Opciones:"
                    + "\n0.- Salir"
                    + "\n1.- Crear libro"
                    + "\n2.- Agregar capítulo"
                    + "\n3.- Mostrar libro"
                    + "\n4.- Eliminar libro");

            if (input == null || input.isBlank()) {
                dInf("¡No puede quedar en blanco!");
                continue;
            }
            try {
                el = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                dInf("¡Solo números!");
                continue;
            }

            switch (el) {
                case 0:
                    dInf("Adiós");
                    break;
                case 1:
                    String titulo = pDat("Título:");
                    String autor = pDat("Autor:");
                    String editorial = pDat("Editorial:");
                    String isbn = pDat("ISBN:");
                    if (titulo == null || titulo.isBlank()
                            || autor == null || autor.isBlank()
                            || editorial == null || editorial.isBlank()
                            || isbn == null || isbn.isBlank()) {
                        dInf("¡No puede quedar en blanco!");
                    } else {
                        try {
                            libro = new Libro(titulo, autor, editorial, isbn);
                            dInf("Libro creado");
                        } catch (DatosInvalidosException e) {
                            dInf("¡Los datos no son válidos!");
                        }
                    }
                    break;
                case 2:
                    try {
                        if (libro == null) {
                            throw new LibroInexistenteException("Primero debe crear un libro");
                        }
                        String titCap = pDat("Título del capítulo:");
                        int pag = Integer.parseInt(pDat("Número de páginas:"));
                        Capitulo c = new Capitulo(titCap, pag);
                        libro.insertarCapitulo(c);
                        dInf("Capítulo agregado");
                    } catch (LibroInexistenteException | LimiteCapsException e) {
                        dInf(e.getMessage());
                    } catch (NumberFormatException e) {
                        dInf("Las páginas deben ser números");
                    }
                    break;
                case 3:
                    try {
                        if (libro == null) {
                            throw new LibroInexistenteException("No existe libro");
                        }
                        dInf(libro.mostrarLibro());
                    } catch (LibroInexistenteException e) {
                        dInf(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        if (libro == null) {
                            throw new LibroInexistenteException("¡No existe libro!");
                        }
                        libro.eliminarLibro();
                        libro = null;
                        dInf("Libro eliminado");
                    } catch (LibroInexistenteException e) {
                        dInf(e.getMessage());
                    }
                    break;
                default:
                    dInf("Opción inválida");
            }
        } while (el != 0);
    }
    public static String pDat(String txt) {
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }
}