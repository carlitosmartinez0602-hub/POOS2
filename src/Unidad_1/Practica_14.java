package Unidad_1;

import javax.swing.*;

public class Practica_14 {
    static void main() {
        String p = JOptionPane.showInputDialog(null, "Escribe una contraseña");
        int [] c = {0,0,0,0,0,0};
        String txt = p.toLowerCase();
        for (int i = 0; i < txt.length(); i++) {
            char a = txt.charAt(i);
            switch (a){
                case 'b': c[0]++; break;
                case 'r': c[1]++; break;
                case 'o': c[2]++; break;
                case 'k': c[3]++; break;
                case 'e': c[4]++; break;
                case 'n': c[5]++; break;
            }
        }
        if (c[0] == c[1] && c[1] == c[2] && c[2]==c[3] && c[3] == c[4] && c[4] == c[5]) {
            JOptionPane.showMessageDialog(null, "La contrasena no segura");
        }else{
            JOptionPane.showMessageDialog(null, "La contraseña es segura");
        }
    }
}
