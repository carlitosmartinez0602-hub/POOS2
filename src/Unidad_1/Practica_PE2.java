package Unidad_1;

import javax.swing.*;

public class Practica_PE2 {
    static void main() {
        String p = JOptionPane.showInputDialog(null, "Escribe algo: ");
        int pos=0;
        String lb= JOptionPane.showInputDialog(null, "letra a buscar: ");
        String pl = p.toLowerCase();
        pos = pl.indexOf(lb);
        JOptionPane.showMessageDialog(null, "Resultado: " + pos);
    }
}
