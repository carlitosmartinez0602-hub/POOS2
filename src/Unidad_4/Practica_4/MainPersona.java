package Unidad_4.Practica_4;

import javax.swing.*;

public class MainPersona {
    static void main(String[] args) {
        int el = 0;

        do {
            String input = pDat("|-----Opciones-----|\n" +
                    "\n0.- Salir" +
                    "\n1.- Registrar paciente y médico");
            if (input == null || input.isBlank()) {
                dInf("No puede quedar este espacio en blanco");
            } else {
                try {
                    el = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    dInf("Solo números");
                }
            }
            switch (el) {
                case 0:
                    dInf("Adios");
                    break;
                case 1:
                    String nomPaciente = pDat("Nombre del paciente: ");
                    int edadPaciente = Integer.parseInt(pDat("Edad del paciente: "));
                    char sexoPaciente = pDat("Sexo del paciente (H/M): ").charAt(0);
                    double pesoPaciente = Double.parseDouble(pDat("Peso del paciente (kg): "));
                    double alturaPaciente = Double.parseDouble(pDat("Altura del paciente (m): "));
                    String fechaConsulta = pDat("Fecha de primera consulta: ");
                    //medico
                    String nomMedico = pDat("Nombre del médico: ");
                    int edadMedico = Integer.parseInt(pDat("Edad del médico: "));
                    char sexoMedico = pDat("Sexo del médico (H/M): ").charAt(0);
                    double pesoMedico = Double.parseDouble(pDat("Peso del médico (kg): "));
                    double alturaMedico = Double.parseDouble(pDat("Altura del médico (m): "));
                    double precioConsulta = Double.parseDouble(pDat("Precio de la consulta: "));
                    String especialidad = pDat("Especialidad del médico: ");

                    Medico medico = new Medico(nomMedico, edadMedico, sexoMedico, pesoMedico, alturaMedico, precioConsulta, especialidad);
                    Paciente paciente = new Paciente(nomPaciente, edadPaciente, sexoPaciente, pesoPaciente, alturaPaciente, fechaConsulta, medico);

                    String msg = "|-----Datos paciente-----|\n" +
                            paciente.toString() +
                            "\n\n|-----Datos medico-----|\n" +
                            medico.toString() +
                            "\n\n|-----IMC-----|\n" +
                            paciente.getMensajeIMC() +
                            "\n\n|-----Mayor de edad-----|\n" +
                            (paciente.esMayorEdad() ? "El paciente es mayor de edad" : "El paciente es menor de edad");

                    dInf(msg);
                    break;
            }
        } while (el != 0);
    }
    public static String pDat(String txt) {
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }
}