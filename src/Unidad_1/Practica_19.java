package Unidad_1;

import javax.swing.*;

public class Practica_19 {
    static void main() {
        String fn = "", p = "";
        char ca = 0, cs = 0;

        while (true) {
            p = JOptionPane.showInputDialog(null, "Escribe un texto (0 para salir): ");

            if (p == null) {
                break;
            }

            if (p.equals("0")) {
                break;
            }
            for (int i = 0; i < p.length(); i++) {
                ca = p.charAt(i);

                while (i + 1 < p.length()) {
                    cs = p.charAt(i + 1);

                    if (Character.isUpperCase(ca) && Character.isLowerCase(cs)) {
                        i++;
                    }
                    else if (Character.isUpperCase(ca) && Character.isUpperCase(cs) && ca > cs) {
                        i++;
                    }
                    else {
                        break;
                    }
                }
                fn += ca;
            }
            JOptionPane.showMessageDialog(null, "Resultado: " + fn);
        }
    }
}