package Unidad_1;

import javax.swing.*;

public class Practica_PE {
    static void main() {
        String p = JOptionPane.showInputDialog(null, "Escribe algo");
        char posi, posf, posm, posma;
        String fn="";
        posi = p.charAt(0);
        posf = p.charAt(p.length()-1);
        posm = p.charAt(p.length()/ 2);
        posma = p.charAt((p.length()/2)-1);


        JOptionPane.showMessageDialog(null,"resultado:\n" + "posición inicial: "+ posi +"\nPosicion media:"+ posm +"\nPosicion media anterior: "+ posma + "\nPosicion final: "+posf);
    }
}
