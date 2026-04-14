package Unidad_2.Pre_Examen;

import javax.swing.*;
import java.util.Arrays;

public class Pre_Examen {
    static void main(String[] args) {
        String cad = pDat("Cadena: (letras y números)");
        int cont=0, suma=0;
        String[] num = cad.split("");
        for (int i = 0; i <cad.length(); i++) {
            char c  = cad.charAt(i);
            if (Character.isDigit(c)) {
                suma += Character.getNumericValue(c)    ;
            }
        }
        dInf("Suma: " + Arrays.toString(num));
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static String dInf(String txt){
        JOptionPane.showMessageDialog(null,txt);
        return "";
    }
}
