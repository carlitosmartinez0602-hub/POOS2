package Unidad_4.Practica_7;

import javax.swing.*;
import java.util.ArrayList;

public class MainPublicaciones {
    static void main(String[] args) {
        int el = 0;
        ArrayList<Publicacion> listaPublicaciones = new ArrayList<>();

        do {
            String input = pDat("|-----Menú de publicaciones-----|\n" +
                    "\n0.- Salir" +
                    "\n1.- Agregar libro impreso" +
                    "\n2.- Agregar audiolibro (CD)" +
                    "\n3.- Mostrar todas las publicaciones" +
                    "\n4.- Editar una publicación" +
                    "\n5.- Eliminar una publicación" +
                    "\n6.- Mostrar estadísticas");

            if (input == null || input.isBlank()) {
                dInf("No puede quedar este espacio en blanco");
            }else {
                try {
                    el = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    dInf("Solo números");
                }
            }

            switch (el) {
                case 0:
                    dInf("Adios");
                    break;
                case 1:
                    String tituloLibro = pDat("Título del libro:");
                    if (tituloLibro == null)
                        break;
                    double precioLibro;
                    try {
                        precioLibro = Double.parseDouble(pDat("Precio del libro:"));
                    } catch (NumberFormatException e) {
                        dInf("Precio no válido");
                        break;
                    }
                    int paginas;
                    try {
                        paginas = Integer.parseInt(pDat("Número de páginas:"));
                    } catch (NumberFormatException e) {
                        dInf("Número de páginas no válido");
                        break;
                    }
                    Libro libro = new Libro(tituloLibro, precioLibro, paginas);
                    listaPublicaciones.add(libro);
                    dInf("Libro agregado correctamente");
                    break;
                case 2:
                    String tituloCD = pDat("Título del audiolibro:");
                    if (tituloCD == null)
                        break;
                    double precioCD;
                    try {
                        precioCD = Double.parseDouble(pDat("Precio del audiolibro:"));
                    } catch (NumberFormatException e) {
                        dInf("Precio no válido");
                        break;
                    }
                    double tiempo;
                    try {
                        tiempo = Double.parseDouble(pDat("Tiempo de reproducción (minutos):"));
                    } catch (NumberFormatException e) {
                        dInf("Tiempo no válido");
                        break;
                    }
                    CD cd = new CD(tituloCD, precioCD, tiempo);
                    listaPublicaciones.add(cd);
                    dInf("Audiolibro agregado correctamente");
                    break;
                case 3:
                    if (listaPublicaciones.isEmpty()) {
                        dInf("No hay publicaciones registradas");
                        break;
                    }
                    String msg = "|-----Lista de publicaxiones-----|\n";
                    for (int i = 0; i < listaPublicaciones.size(); i++) {
                        msg += "\n|-----Publicación " + (i + 1) + "-----|\n";
                        msg += listaPublicaciones.get(i).toString();
                        msg += "\n";
                    }
                    dInf(msg);
                    break;
                case 4:
                    if (listaPublicaciones.isEmpty()) {
                        dInf("No hay publicaciones a editar");
                        break;
                    }
                    String indicetxt = pDat("Número de publicación a editar (1 al " + listaPublicaciones.size() + "):");
                    if (indicetxt == null)
                        break;
                    int indice;
                    try {
                        indice = Integer.parseInt(indicetxt) - 1;
                    } catch (NumberFormatException e) {
                        dInf("Número no válido");
                        break;
                    }
                    if (indice < 0 || indice >= listaPublicaciones.size()) {
                        dInf("Índice no válido");
                        break;
                    }
                    Publicacion p = listaPublicaciones.get(indice);
                    String nuevoTitulo = pDat("Nuevo título (actual: " + p.getTitulo() + "):");
                    if (nuevoTitulo != null && !nuevoTitulo.isBlank()) {
                        p.setTitulo(nuevoTitulo);
                    }
                    double nuevoPrecio;
                    try {
                        nuevoPrecio = Double.parseDouble(pDat("Nuevo precio (actual: $" + p.getPrecio() + "):"));
                        p.setPrecio(nuevoPrecio);
                    } catch (NumberFormatException e) {
                        dInf("Precio no modificado");
                    }
                    if (p instanceof Libro) {
                        Libro l = (Libro) p;
                        try {
                            int nuevasPaginas = Integer.parseInt(pDat("Nuevas páginas (actual: " + l.getNumPaginas() + "):"));
                            l.setNumPaginas(nuevasPaginas);
                        } catch (NumberFormatException e) {
                            dInf("Páginas no modificadas");
                        }
                    } else if (p instanceof CD) {
                        CD c = (CD) p;
                        try {
                            double nuevoTiempo = Double.parseDouble(pDat("Nuevo tiempo (actual: " + c.getTiempoReproduccion() + " minutos):"));
                            c.setTiempoReproduccion(nuevoTiempo);
                        } catch (NumberFormatException e) {
                            dInf("Tiempo no modificado");
                        }
                    }
                    dInf("Publicacion editada correctamente");
                    break;
                case 5:
                    if (listaPublicaciones.isEmpty()) {
                        dInf("No hay publicaciones a eliminar");
                        break;
                    }
                    String eliminartxt = pDat("Ingrese el número de publicación a eliminar (1 al " + listaPublicaciones.size() + "):");
                    if (eliminartxt == null)
                        break;
                    int eliminarIndice;
                    try {
                        eliminarIndice = Integer.parseInt(eliminartxt) - 1;
                    } catch (NumberFormatException e) {
                        dInf("Número no válido");
                        break;
                    }
                    if (eliminarIndice < 0 || eliminarIndice >= listaPublicaciones.size()) {
                        dInf("Índice no válido");
                        break;
                    }
                    Publicacion eliminada = listaPublicaciones.remove(eliminarIndice);
                    dInf("Publicación \"" + eliminada.getTitulo() + "\" eliminada correctamente");
                    break;
                case 6:
                    if (listaPublicaciones.isEmpty()) {
                        dInf("No hay publicaciones registradas");
                        break;
                    }
                    int totalLibros = 0;
                    int totalCDs = 0;
                    double sumaPrecios = 0;
                    int sumaPaginas = 0;
                    double sumaTiempo = 0;
                    for (int i = 0; i < listaPublicaciones.size(); i++) {
                        Publicacion pub = listaPublicaciones.get(i);
                        sumaPrecios += pub.getPrecio();
                        if (pub instanceof Libro) {
                            totalLibros++;
                            Libro l = (Libro) pub;
                            sumaPaginas += l.getNumPaginas();
                        } else if (pub instanceof CD) {
                            totalCDs++;
                            CD c = (CD) pub;
                            sumaTiempo += c.getTiempoReproduccion();
                        }
                    }
                    double promedioPrecios = sumaPrecios / listaPublicaciones.size();
                    String estadisticas = "|-----Estadisticas-----|\n" +
                            "\na) Cantidad total de publicaciones: " + listaPublicaciones.size() +
                            "\nb) Cantidad de libros: " + totalLibros + "\n   Cantidad de CDs: " + totalCDs +
                            "\nc) Promedio de precios: $" + String.format("%.2f", promedioPrecios);
                    if (totalLibros > 0) {
                        double promedioPaginas = (double) sumaPaginas / totalLibros;
                        estadisticas += "\n   Promedio de páginas (libros): " + String.format("%.1f", promedioPaginas);
                    }
                    if (totalCDs > 0) {
                        double promedioTiempo = sumaTiempo / totalCDs;
                        estadisticas += "\n   Promedio de duración (CDs): " + String.format("%.1f", promedioTiempo) + " minutos";
                    }
                    dInf(estadisticas);
                    break;
            }
        } while (el!= 0);
    }
    public static String pDat(String txt) {
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }
}