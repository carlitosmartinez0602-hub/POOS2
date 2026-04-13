package Unidad_2.Practica_20;

import javax.swing.*;
import java.util.Arrays;

public class Practica_20 {
    static void main(String[] args) {
        //Pedir al usuario una cadena
        String cad = pDat("Lista de compra: ");
        int cont=0, caden=0;
        //Separar las palabras de la cadena ademas de espaciarlas un renglón
        String cade = String.join("\n", cad.split(","));
        //Contar la cantidad de letras que hay en una cadena
        for (int i = 0; i < cade.length(); i++) {
            char c  = cade.charAt(i);
            if (Character.isLetter(c)){
                cont++;
            }
            if (c == '\n') {
                dInf(caden + " - " + cont);
                caden++;
                cont=0;
            }
        }
        //Mostrar info
        String fn = " ";
        fn += cade +" - "+ cont;
        dInf(fn);
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static String dInf(String txt){
        JOptionPane.showMessageDialog(null, txt);
        return "";
    }
}
