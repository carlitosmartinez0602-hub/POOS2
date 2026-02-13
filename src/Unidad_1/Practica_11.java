package Unidad_1;

import javax.swing.*;

public class Practica_11 {
    static void main() {
        String contr = JOptionPane.showInputDialog(null, "Escribe una contraseña: ");
        String pass= "ITSPA123x";
        if (contr.contains("ITSPA") && contr.endsWith("123x") && contr.equals(pass)) {
            System.out.println("Contraseña válida. Hola TilinInsano");
        }else{
            System.out.println("La contraseña no es válida :(");
        }
    }
}
