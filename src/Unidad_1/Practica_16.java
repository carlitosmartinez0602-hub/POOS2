package Unidad_1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class    Practica_16 {
    static void main() {
        ArrayList<Long> num = new ArrayList<>();
        String p="";
        while (true) {
            p = JOptionPane.showInputDialog(null, "Ingresa un número: (negativo para salir)");
            long np = Long.parseLong(p);
            if (np < 0) {
                break;
            }
            num.add(np);
        }
        String fn = "";

        for (int i = 0; i < num.size(); i++) {
            long n = num.get(i);
            String t = String.valueOf(n);
            String st = "";
            long sd = 0;

            for (int j = 0; j < t.length(); j++) {
                int d = Character.getNumericValue(t.charAt(j));
                sd += d;
                st += d;
                if (j < t.length() - 1) {
                    st += "+";
                }
            }
            fn += st + " = " + sd + "\n";
        }
        JOptionPane.showMessageDialog(null, fn);
    }
}
