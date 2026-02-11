package Unidad_1;

import javax.swing.*;

public class Practica_9 {
    static void main() {
        String txt = JOptionPane.showInputDialog(null, "Ingresa una oración:");
        txt = txt.trim();
        int ue = txt.lastIndexOf(" ");
        String fn;

        if (ue != -1) {
            String in = txt.substring(0, ue);
            String up = txt.substring(ue + 1);

            up = up.toUpperCase();

            fn = in + " " + up;
        } else {
            fn = txt.toUpperCase();
        }
        System.out.println(fn);
    }
}