package Unidad_2.Practica_9;

import javax.swing.*;

public class Practica_9_1 {
    public static void main(String[] args) {
        try {
            String input = JOptionPane.showInputDialog("Número");
            int x = Integer.parseInt(input); // Convertir String a int
            JOptionPane.showMessageDialog(null, "El número es: " + x);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Debes ingresar un número válido");
        }
    }
}