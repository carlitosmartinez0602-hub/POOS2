package Unidad_4.Practica_1;

import javax.swing.*;

public class MainEmpleado {
    static void main(String[] args) {
        //Empleado predefinido
        Empleado e1  = new Empleado("Brayan", 12, 1000);

        e1.aumentarSueldo();
        dInf(e1.toString());

        //Empleado dado por el usuario
        int id = Integer.parseInt(pDat("Id: "));
        String nombre = pDat("Nombre: ");
        double sueldo = Double.parseDouble(pDat("sueldo: "));

        Empleado e1_1= new Empleado(nombre, id, sueldo);

        e1_1.aumentarSueldo();
        dInf(e1_1.toString());

        //objeto hijo de empleado dado por usuario
        int idG = Integer.parseInt(pDat("ID gerente: "));
        String nombreG = pDat("Nombre gerente: ");
        double sueldoG = Double.parseDouble(pDat("Sueldo: "));
        int presupuesto = Integer.parseInt(pDat("Presupuesto: "));

        Gerente g1  = new Gerente(nombreG, idG,sueldoG, presupuesto);

        g1.aumentarSueldo();
        dInf(g1.toString() + "\nPresupuesto: "+ presupuesto);
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt){
         JOptionPane.showMessageDialog(null,txt);
    }
}
