package Unidad_1;

import javax.swing.*;

public class Practica_18 {
    static void main() {
        String p = JOptionPane.showInputDialog(null, "Escribe un texto: ");
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe un numero: "));
        char c = '*';
        String fn = "";
        int la = p.length();

        if (la < n) {
            for (int i = 0; i < (n - la); i++) {
                fn += c;
            }
        }
        fn += p;

        JOptionPane.showMessageDialog(null, fn);
    }
}
