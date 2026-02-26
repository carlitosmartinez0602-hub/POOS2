package Unidad_2.Practica_1;

import javax.swing.*;

public class Principal {
    static void main() {
        int n= Integer.parseInt(JOptionPane.showInputDialog(null, "Dame un número: "));
        Practica_1_1.Matematicas mat = new Practica_1_1.Matematicas();
        mat.factorial(n);
        JOptionPane.showMessageDialog(null, "Resultado: " + mat);
    }
}
