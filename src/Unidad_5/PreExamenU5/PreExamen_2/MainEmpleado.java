package Unidad_5.PreExamenU5.PreExamen_2;

import javax.swing.*;
import java.util.ArrayList;

public class MainEmpleado {
    static void main(String[] args) {
        int el = 0;
        ArrayList<Empleado> listaEmpleado = new ArrayList<>();

        do {
            String input = pDat("|-----Opciones-----|\n" +
                    "\n0.- Salir" +
                    "\n1.- Registrar empleado" +
                    "\n2.- Ver empelados y salarios");

            if (input == null || input.isBlank()) {
                dInf("No puede quedar en blanco");
            }else{
                try {
                    el = Integer.parseInt(input);
                }catch (NumberFormatException e ){
                    dInf("Ingresa un número válido");
                }
            }

            switch (el){
                case 0:
                    dInf("Adios");
                    break;
                case 1:
                    String horasTrabajadas = pDat("Horas trabajadas: ");
                    String sueldoPorHora = pDat("Sueldo por hora");
                    int horasT = 0;
                    double sueldoPH = 0;

                    if (horasTrabajadas == null || horasTrabajadas.isBlank()) {
                        dInf("No se puede calcular salario sin las horas");
                    }else{
                        try {
                            horasT = Integer.parseInt(horasTrabajadas);
                        }catch (NumberFormatException e ){
                            if (horasT <= 0) {
                                dInf("Ingresa un número válido");
                                break;
                            }
                        }
                    }
                    if (sueldoPorHora == null || sueldoPorHora.isBlank()) {
                        dInf("No se puede calcular salario sin el sueldo por hora");
                    }else{
                        try {
                            sueldoPH = Double.parseDouble(sueldoPorHora);
                        }catch (NumberFormatException e ){
                            if (sueldoPH <= 0) {
                                dInf("Ingresa un número válido");
                            }
                        }
                    }
                    Empleado emp;
                    if (horasT <= 40) {
                        emp = new EmpleadoSinHorasExtra(horasT, sueldoPH);
                    } else if (horasT <= 45) {
                        int extras = horasT - 40;
                        emp = new EmpleadoConHorasDoble(horasT,sueldoPH,extras);
                    }else{
                        int extras = horasT - 40;
                        emp = new EmpleadoConHorasTriple(horasT, sueldoPH,extras);
                    }
                    listaEmpleado.add(emp);
                    dInf("Salario: " + emp.calcularSalario());
                    break;
                case 2:
                    if (listaEmpleado.isEmpty()) {
                        dInf("No hay empleados");
                    }else{
                        String fn = " ";
                        for (int i = 0; i < listaEmpleado.size(); i++) {
                            Empleado e = listaEmpleado.get(i);
                            fn += e + "\n\n";
                        }
                        dInf(fn);
                    }
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
        JOptionPane.showMessageDialog(null, txt);
    }
}
