package Unidad_2.Practica_8;

import javax.swing.*;
public class Principal_8 {
    static void main(String[] args) {
        vehiculo.Vehiculo veh1 = new vehiculo.Vehiculo("ABC1231","Toyota"," Supra",500000);
        vehiculo.Vehiculo veh2  = new vehiculo.Vehiculo("DEF0989","Chevrolet"," El camino",600000);

        pr("Vehículo 1: \n" + veh1.toString());
        pr("Vehículo 2: \n" + veh2.toString());

        veh1.setPrecio(200000);
        pr(veh1.toString());

        libro l1 = new libro("El Señor de los Anillos: La Comunidad del Anillo", "J.R.R. Tolkien",
                "Alta Fantasía", 1954);
        libro l2 = new libro("El bosque oscuro", "Cixin Liu", "Ciencia Ficción", 2008);

        pr("Libro 1: "+l1.getTitulo());
        pr("Libro 2: "+l2.getTitulo());

        Celular cel = new Celular();

        cel.setMarca(gt("Marca del celular: "));
        cel.setnSerie(gt("Número de serie: "));
        cel.setPrecio(Integer.parseInt(gt("Precio: ")));

        pr(cel.toString());

        cel.setPrecio(888);
    }
    public static void pr(String s) {
        JOptionPane.showMessageDialog(null, s);
    }

    public static String gt(String m) {
        return JOptionPane.showInputDialog(m);
    }
}
