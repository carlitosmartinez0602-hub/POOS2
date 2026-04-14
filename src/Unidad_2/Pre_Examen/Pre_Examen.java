package Unidad_2.Pre_Examen;

import javax.swing.*;

public class Pre_Examen {
    static void main(String[] args) {
        //Pedir la cadena
        String cad = pDat("Cadena: (letras y números)");
        //Validar si el JOption esta vacio
        if (cad.isEmpty()) {
            return;
        }
        int suma=0;
        //Separar las letras de los numeros dejando solo los numeros
        String[] num = cad.split("\\D+");
        //contar y separar cada numero para sumarlo
        for (int i = 0; i <num.length; i++) {
            if (!num[i].isEmpty()) {
                suma += Integer.parseInt(num[i]);
            }
        }
        //Mostrar info
        dInf("Suma: " + suma);
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static String dInf(String txt){
        JOptionPane.showMessageDialog(null,txt);
        return "";
    }
}
