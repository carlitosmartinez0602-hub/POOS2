package Unidad_2.EjerciciosCharAtETC;

import javax.swing.*;

public class E2 {
    static void main(String[] args) {
        boolean esValido = true;
        String cadena = JOptionPane.showInputDialog("Cadena: ");
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (!Character.isLowerCase(caracter)) {
                esValido = false;
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Letras: " + esValido);
    }
}
