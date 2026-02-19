package Unidad_1;

import javax.swing.*;
import java.util.Arrays;

public class Practica_17 {
    static void main() {
        String p;
        p = JOptionPane.showInputDialog(null, "Ingresa un texto:");
        String[] ps = p.split("");
        String fn = String.join(" ", ps);
        JOptionPane.showMessageDialog(null, "Resultado: \n" + fn);
    }
}
