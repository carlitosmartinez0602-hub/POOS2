package Unidad_4.Practica_w;

import javax.swing.*;
import java.util.ArrayList;

public class MainEmpleado {
    static void main() {
        int el  = 0;
        ArrayList<Empleado> listaEmpleado  =new ArrayList<>();
        do {
            String input = pDat("|-----Opciones-----|\n" +
                    "\n0.- Salir" +
                    "\n1.- Agregar empleado por hora" +
                    "\n2.- Agregar empleado asalariado" +
                    "\n3.- Mostrar todos los empleados" +
                    "\n4.- Buscar empleado por ID" +
                    "\n5.-Mostrar nómina total" +
                    "\n6.- Mostrar empleado con mayor salario");
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
                    int idxHour = Integer.parseInt(pDat("ID: "));
                    String namexHour = pDat("Nombre: ");
                    int agexHour = Integer.parseInt(pDat("Edad: "));
                    double wHours = Double.parseDouble(pDat("Horas trabajadas: "));
                    double pPerHour = Double.parseDouble(pDat("Pago por hora: "));
                    EmpleadoXHora empxHora = new EmpleadoXHora(namexHour,idxHour,agexHour,wHours,pPerHour);
                    listaEmpleado.add(empxHora);
                    dInf("Empledo por hora creado con éxito");
                    break;
                case 2:
                    int idAsa = Integer.parseInt(pDat("ID: "));
                    String nameAsa = pDat("Nombre: ");
                    int ageAsa = Integer.parseInt(pDat("Edad: "));
                    double monthlySalary = Double.parseDouble(pDat("Salario mensual: "));
                    EmpleadoAsalariado empAsa = new EmpleadoAsalariado(nameAsa,idAsa,ageAsa,monthlySalary);
                    listaEmpleado.add(empAsa);
                    dInf("Empleado asalariado creado con éxito");
                    break;
                case 3:
                    if (listaEmpleado.isEmpty()) {
                        dInf("No hay Empleados registrados");
                    }else{
                        for (int i = 0; i < listaEmpleado.size(); i++) {
                            Empleado e = listaEmpleado.get(i);
                        }
                        dInf(listaEmpleado.toString());
                    }
                    break;
                case 4:
                    int searchForID= Integer.parseInt(pDat("ID a buscar: "));
                    for (int i = 0; i < listaEmpleado.size(); i++) {
                        Empleado e = listaEmpleado.get(i);
                        if (e.getId() == searchForID) {
                            dInf("|-----ID encontrado-----|\n" + e.toString());
                            break;
                        }
                    }
                    break;
                case 5:
                    double nomina=0;
                    for (int i = 0; i < listaEmpleado.size(); i++) {
                        Empleado e = listaEmpleado.get(i);
                        if (e instanceof EmpleadoXHora) {
                            nomina += ((EmpleadoXHora) e ).CalculateSalary();
                        }
                        if (e instanceof EmpleadoAsalariado) {
                            nomina += ((EmpleadoAsalariado) e).CalculateSalary2();
                        }
                    }
                    dInf("Nomina total: " + nomina);
                    break;
                case 6:
                    double actualSalary = 0;
                    double highestSalary = 0;
                    for (int i = 0; i < listaEmpleado.size(); i++) {
                        Empleado e = listaEmpleado.get(i);
                        if (e instanceof EmpleadoAsalariado) {
                            actualSalary = ((EmpleadoAsalariado) e).CalculateSalary2();
                        }
                        if (e instanceof EmpleadoXHora) {
                            actualSalary = ((EmpleadoXHora) e).CalculateSalary();
                        }

                        if (actualSalary > highestSalary) {
                            highestSalary = actualSalary;
                        }
                    }
                    dInf("Salario más alto: " + highestSalary);
                    break;
                default:
                    dInf("No existe ésa opción");
                    break;
            }
        }while (el != 0);
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt){
        JOptionPane.showMessageDialog(null,txt);
    }
}
