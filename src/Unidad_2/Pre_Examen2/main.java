package Unidad_2.Pre_Examen2;

import javax.swing.*;

public class main {
    static void main() {
        int el=0;
        el = Integer.parseInt(pDat("Elige la opcion: " +
                "0.- Salir\n" +
                "1.- "));
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt){
        JOptionPane.showMessageDialog(null, txt);
    }
}
