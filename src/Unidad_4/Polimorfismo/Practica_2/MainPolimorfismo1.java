package Unidad_4.Polimorfismo.Practica_2;

import javax.swing.*;
import java.util.ArrayList;

public class MainPolimorfismo1 {
    static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        int el =0;
        do {
            String input = pDat("|-----Opciones-----|" +
                    "\n0.- Salir" +
                    "\n1.- Agregar un vededor" +
                    "\n2.- Agregar un secretario" +
                    "\n3.- Agregar un Jefe de zona" +
                    "\n4.- Mostrar todos los empleados");
            if (input == null || input.isBlank()) {
                dInf("No puede quedar en blanco");
            }else {
                el = Integer.parseInt(input);
            }
            switch (el){
                case 0:
                    dInf("Adios");
                    break;
                case 1:
                    String claveVen = pDat("Clave del vededor: ");
                    String nomVen = pDat("Nombre del vededor: ");
                    String apeVen = pDat("Apellidos del vendedor: ");
                    String direccionVen = pDat("Dirección: ");
                    int antiguedadVen = Integer.parseInt(pDat("años de servicio: "));
                    String telefonoVen = pDat("Telefono: ");
                    Empleado supervisorVen = new Empleado("221-ds","Brayan", "Lopez Cervantes", "Janitzio", 15, "4341284323", 15000, null);
                    Auto autoVendedor = new Auto("213-JJA-2", "Mercedes", "insano");
                    String areaVentaVen = pDat("Área de venta: ");
                    double salVen = Double.parseDouble(pDat("Salario del vendedor: "));
                    String[] clientesVen = new String[3];
                    clientesVen[0] = "Tilin insano";
                    clientesVen[1] = "Belinda Garcia";
                    clientesVen[2] = "Diego Canijo";
                    Empleado ven = new Vendedor(claveVen,nomVen,apeVen, direccionVen, antiguedadVen,telefonoVen,salVen,supervisorVen, autoVendedor, "alks", areaVentaVen, clientesVen,12);
                    listaEmpleados.add(ven);
                    dInf("Vendedor creado con éxito");
                    break;
                case 2:
                    String claveSec;
                    String nomSec;
                    String apeSec;
                    String direSec;
                    int antiguedadSec;
                    String telSec;
                    double salarioSec;
                    Empleado supervisorSec = new Empleado("221-ds","Brayan", "Lopez Cervantes", "Janitzio", 15, "4341284323", 15000, null);
                    String despachoSec;
                    String faxSec;
                    Empleado sec = new Secretario(claveSec,nomSec, apeSec, direSec, antiguedadSec, telSec, salarioSec, supervisorSec,despachoSec, faxSec);
                    break;
                case 3:
                    break;
                case 4:
                    if (listaEmpleados.isEmpty()) {
                        dInf("No hay empleados a mostrar");
                    }else{
                        String msg  = " ";
                        for (int i = 0; i < listaEmpleados.size(); i++) {
                            Empleado e = listaEmpleados.get(i);
                             msg += e;
                        }
                        dInf(msg);
                    }
                    break;
                default:
                    dInf("Ésa opción no existe");
                    break;
            }
        }while(el!=0);
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt){
        JOptionPane.showMessageDialog(null, txt);
    }
}
