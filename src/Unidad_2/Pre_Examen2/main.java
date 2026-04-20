package Unidad_2.Pre_Examen2;

import javax.swing.*;

public class main {
    static void main() {
        String nmbAl = pDat("Nombre del alumno: ");
        int edadAl = Integer.parseInt(pDat("Edad del alumno"));
        validaciones val = new validaciones();
        Alumno al = new Alumno(nmbAl,edadAl);

        try {
            val.validarNombre(nmbAl);
            val.validarEdad(edadAl);
            dInf("Datos: \n" + al.toString());
        } catch (nombreinvalidoException | edadinvalidaException e) {
            dInf("Error: " + e.getMessage());
        }
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt){
        JOptionPane.showMessageDialog(null, txt);
    }
}
