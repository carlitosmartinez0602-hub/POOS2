package Unidad_2.EjercicioWango2;

import javax.swing.*;

public class PrincipalWango2 {
    static void main(String[] args) {
        String nombre = pDat("Nombre: ");
        String dni = pDat("DNI:\n (8 digitos y una letra al final): ");

        try {
            persona p1 = new persona(nombre, dni);
            dInf("Persona regristrada: \n" + p1);
        }catch (dniInvalidoException e){
            dInf("Error! " + e.getMessage());
        }
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static String dInf(String txt){
        JOptionPane.showMessageDialog(null,txt);
        return " ";
    }
}
