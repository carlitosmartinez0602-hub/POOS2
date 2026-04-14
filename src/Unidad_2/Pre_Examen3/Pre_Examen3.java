package Unidad_2.Pre_Examen3;

import javax.swing.*;

public class Pre_Examen3 {
    static void main(String[] args) {
        String cad = pDat("Ingresa los hashtags (con espacio entre sí): ");
        String cade = String.join("\n", cad.split(" "));
        int cont=0;
        int a=0;
        String caden="";
        String mc="";
        int mC=0;
        for (int i = 0; i < cade.length(); i++) {
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
                cont = 0;
                caden = "";
            }
            if (c > 5) {
                mc += caden;
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