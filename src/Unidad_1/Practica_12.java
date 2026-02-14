package Unidad_1;

import javax.swing.*;

public class Practica_12 {
    static void main() {
        String txt = JOptionPane.showInputDialog(null, "Escribe algo");
        String fn="",rs="",ul="";

        for (int i = 0; i <= txt.length(); i++) {
            ul = txt.substring(txt.length()-i);
            rs=txt.substring(0, txt.length() -i);
            fn= ul + rs;
            System.out.println(fn);
        }
    }
}
