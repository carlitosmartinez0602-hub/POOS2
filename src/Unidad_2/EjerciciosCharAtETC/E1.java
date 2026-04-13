package Unidad_2.EjerciciosCharAtETC;

import javax.swing.*;

public class E1 {
    static void main(String[] args) {
        int cont = 0;
        String cadena = JOptionPane.showInputDialog("Cadena: ");
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (Character.isDigit(caracter)) {
                cont++;
            }
        }
        JOptionPane.showMessageDialog(null, "Digitos encontrados" + cont);
    }
}
