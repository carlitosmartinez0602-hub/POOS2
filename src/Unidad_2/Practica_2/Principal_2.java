package Unidad_2.Practica_2;

import javax.swing.*;

public class Principal_2 {
    public static void main(String[] args) {
        Practica_2_1.persona p1 = new Practica_2_1.persona("", "", "", 250920309, 20);
        p1.setId(250920309);
        p1.setNomb("Alondra");
        p1.setApPat("Medina");
        p1.setApMat("Piñón");
        p1.setEdad(20);
        JOptionPane.showMessageDialog(null, "Nombre: " + p1.getNomb());


        Practica_2_1.persona p2 = new Practica_2_1.persona("", "", "", 250920308, 21);
        p2.setId(250920308);
        p2.setNomb("Alex");
        p2.setApPat("Martínez");
        p2.setApMat("Domínguez");
        p2.setEdad(21);

    }
}
