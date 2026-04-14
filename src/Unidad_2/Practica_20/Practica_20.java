package Unidad_2.Practica_20;

import javax.swing.*;

public class Practica_20 {
    static void main(String[] args) {
        //Pedir al usuario una cadena
        String cad = pDat("Lista de compra: ");
        //validar si esta vacio el JOption
        if (cad.isEmpty()) {
            return;
        }
        int cont=0;
        String caden="";
        //Separar las palabras de la cadena ademas de espaciarlas un renglón
        String cade = String.join("\n", cad.split(","));
        //Contar la cantidad de letras que hay en una cadena
        for (int i = 0; i < cade.length(); i++) {
            char c  = cade.charAt(i);
            if (Character.isLetter(c)){
                cont++;
                caden += c;
            }
            if (c == '\n') {
                dInf(caden + " - " + cont);
                cont=0;
                caden="";
            }
        }
        //Mostrar info del ultimo
        String fn = " ";
        fn += caden + " - " + cont;
        dInf(fn);
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static String dInf(String txt){JOptionPane.showMessageDialog(null, txt);return ""; }
}
