package Unidad_3.Practica_2;

import javax.swing.JOptionPane;

public class MainLibro {
    static void main(String[] args) {

        Libro libro = null;
        int el;
        do {
            el = Integer.parseInt(
                    pDat("Opciones: "
                            + "\n0.- Salir"
                            + "\n1.- Crear libro"
                            + "\n2.- Agregar capítulo"
                            + "\n3.- Mostrar libro"
                            + "\n4.- Eliminar libro"));

            switch (el) {
                case 0:
                    dInf("Adios");
                    break;
                case 1:
                    String titulo = pDat("Título:");
                    String autor = pDat("Autor:");
                    String editorial = pDat("Editorial:");
                    String isbn = pDat("ISBN:");
                    libro = new Libro(titulo, autor, editorial, isbn);
                    dInf("Libro creado.");
                    break;
                case 2:
                    if (libro != null) {
                        String titCap = pDat("Título del capítulo:");
                        int pag = Integer.parseInt(pDat("Número de páginas:"));
                        Capitulo c = new Capitulo(titCap, pag);
                        libro.insertarCapitulo(c);
                        dInf("Capítulo agregado");
                    } else {
                        dInf("Primero cree el libro");
                    }
                    break;
                case 3:
                    if (libro != null) {
                        dInf(libro.mostrarLibro());
                    } else {
                        dInf("No existe libro");
                    }
                    break;
                case 4:
                    if (libro != null) {
                        libro.eliminarLibro();
                        libro = null;
                        dInf("Libro eliminado");
                    } else {
                        dInf("No existe libro");
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