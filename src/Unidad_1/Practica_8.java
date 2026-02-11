package Unidad_1;

import javax.swing.*;

public class Practica_8 {
    static void main() {
        String txt = JOptionPane.showInputDialog(null, "Di algo:");
        txt = txt.trim();
        String[] plb = txt.split(" ");
        String fn = "";

        for (int i = 0; i < plb.length; i++) {
            String pa = plb[i];
            if (i == plb.length - 1) {
                pa = pa.toUpperCase();
            }
            fn = fn + pa + " ";
        }
        System.out.println(fn.trim());
    }
}