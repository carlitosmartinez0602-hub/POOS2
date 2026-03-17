package Unidad_2.Practica_9;

import javax.swing.*;

public class validacionesPrueba {
    static void main(String[] args) {
        try {
            String msg[] = {"primero", "segundo", "tercero"};
            for (int i = 0; i <= 3; i++) {
                JOptionPane.showMessageDialog(null, "Mensaje: " + msg[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "No es posible alcanzar ésa casilla :(");
        }
        try {
            String plb = "Maldita sea carajo";
            for (int i = 0; i < plb.length(); i++) {
                JOptionPane.showMessageDialog(null, plb.charAt(50));
            }
        } catch (StringIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Casilla no alcanzable");
        }

        try{
            float x = 5/0;
            JOptionPane.showMessageDialog(null, "Matemáticas: " + x);
        }catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
        }finally {
            JOptionPane.showMessageDialog(null, "A pesar de todo el bloque cae aquí");
        }

    }
}