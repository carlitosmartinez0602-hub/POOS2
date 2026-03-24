package Unidad_2.Practica_15;

import javax.swing.*;

public class Principal {
    static void main(String[] args) {
        Persona p1= new Persona(0, "","","");
        try{
            p1.setId(Integer.parseInt(pDat("ID: ")));
            p1.setNombre(pDat("Nombre: "));
            p1.setApellidoPat(pDat("Apellido Paterno: "));
            p1.setApellidoMat(pDat("Apellido Materno: "));
            JOptionPane.showMessageDialog(null, "Datos: \n" + p1.toString());
        }catch (validarNombreException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
}
