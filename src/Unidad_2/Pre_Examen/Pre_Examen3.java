package Unidad_2.Pre_Examen;

import javax.swing.*;

public class Pre_Examen3 {
    static void main(String[] args) {
        String cad = pDat("Ingresa los hashtags (con espacio entre sí): ");
        String cade = String.join("\n", cad.split(" "));
        int cont=0;
        int a=0;
        String caden="";
        String mc="";
        for (int i = 1; i < cade.length(); i++) {
            char c = cade.charAt(i);
            if (Character.isLetter(c)) {
                cont++;
                caden += c;
            }
            if (c == '#') {
                dInf(caden + " - " + cont);
                if (cont > a) {
                    a = cont;
                }
                if (cont >= 5) {
                    mc += " - " + caden;
                }
                cont = 0;
                caden = "";
            }
        }
        String fn="";
        fn += caden + " - " + cont;
        dInf(fn);

        dInf("Hashtags con mas de cinco letras: " + mc);
        dInf("Hashtags que cumplen con el requisito mas de 5: " + mc);
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static String dInf(String txt){
        JOptionPane.showMessageDialog(null,txt);
        return "";
    }
}