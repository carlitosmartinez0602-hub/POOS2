package Unidad_1;

import javax.swing.*;

public class Practica_13 {
    static void main() {
        String pass = JOptionPane.showInputDialog(null, "Escribe una contraseña");
        int posu = 0, posp=0, posm=0, posma=0;
        posu = pass.charAt(pass.length()-1);
        posp = pass.charAt(0);
        posm = pass.charAt(pass.length() / 2);
        posma = pass.charAt((pass.length() / 2)-1);

        boolean cp = posp > posu;
        boolean cc = posm > posma;

        if (cp && cc) {
            JOptionPane.showMessageDialog(null, "La contraseña es válida");
        }else{
            JOptionPane.showMessageDialog(null, "La contrassseña no es débil");
        }
    }
}
