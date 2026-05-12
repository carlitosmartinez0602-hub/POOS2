package Unidad_3.Practica_1;

import javax.swing.*;
public class MainEmpresa {
    static void main(String[] args) {
        Empresa empresa = null;
        int el;
        do {
            el = Integer.parseInt(
                    pDat("Opciones: "
                            + "\n0.- Salir"
                            + "\n1.- Crear empresa"
                            + "\n2.- Agregar departamento"
                            + "\n3.- Mostrar empresa"
                            + "\n4.- Eliminar empresa"));

            switch (el) {
                case 0:
                    dInf("Adios");
                    break;
                case 1:
                    String rfc = pDat("RFC:");
                    String razon = pDat("Razón Social:");
                    String gerente = pDat("Nombre del gerente:");
                    empresa = new Empresa(rfc, razon, gerente);
                    dInf("Empresa creada.");
                    break;
                case 2:
                    if (empresa != null) {
                        int num = Integer.parseInt(
                                pDat("Número departamento:")
                        );
                        String nombre = pDat("Nombre departamento:");
                        String jefe = pDat("Nombre del jefe:");
                        Departamento d = new Departamento(num, nombre, jefe);
                        empresa.insertarDepartamento(d);
                        dInf("Departamento agregado");
                    } else {
                        dInf("Primero cree la empresa");
                    }
                    break;
                case 3:
                    if (empresa != null) {
                        dInf(empresa.mostrarEmpresa());
                    } else {
                        dInf("No existe empresa");
                    }
                    break;
                case 4:
                    if (empresa != null) {
                        empresa.eliminarEmpresa();
                        empresa = null;

                        dInf("Empresa eliminada");
                    } else {
                        dInf("No existe empresa");
                    }
                    break;
                default:
                    dInf("Opción inválida");
            }

        } while (el != 5);
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }

    public static void dInf(String txt){
        JOptionPane.showMessageDialog(null, txt);
    }
}
