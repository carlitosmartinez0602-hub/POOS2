package Unidad_1;

import javax.swing.*;

public class Practica_10 {
    static void main() {
        String txt = JOptionPane.showInputDialog(null, "Di algo:");
        txt = txt.trim();
        int pos = txt.indexOf(" ");
        int ue = -1;

        while (pos != -1) {
            ue = pos;
            pos = txt.indexOf(" ", pos + 1);
        }

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