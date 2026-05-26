package Unidad_4.Practica_2;

import javax.swing.*;

public class Animal {
    public void mover(){
        dInf("Los animales pueden moverse");
    }
    public void dormir(){
        dInf("El animal duerme");
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt){
        JOptionPane.showMessageDialog(null,txt);
    }
}
