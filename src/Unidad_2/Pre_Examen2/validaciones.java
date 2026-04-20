package Unidad_2.Pre_Examen2;

import javax.swing.*;

public class validaciones {
    public void validarEdad(int edad) throws edadinvalidaException{
        if (edad < 0) {
            JOptionPane.showMessageDialog(null, "¡La edad no puede ser negativa!");
        }
    }
    public void validarNombre(String nombre) throws nombreinvalidoException{
        if (nombre.isEmpty() && tieneNumeros(nombre)) {
            JOptionPane.showMessageDialog(null, "¡El nombre no peude tener números en el mismo!");
        }
    }

    static boolean tieneNumeros(String cad){
        for (int i = 0; i < cad.length(); i++) {
            if (Character.isDigit(cad.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
