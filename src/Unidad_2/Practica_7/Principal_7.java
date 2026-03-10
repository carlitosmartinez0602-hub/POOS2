package Unidad_2.Practica_7;

import javax.swing.*;

import java.util.ArrayList;

public class Principal_7 {
    static void main() {
        ArrayList<Practica_7_1.Alumno> datos = new ArrayList<>();
        int el, elAlu;
        do {
            el = Integer.parseInt(JOptionPane.showInputDialog("Elige la opción: \n" +
                    "0.- Salir\n" +
                    "1.- Dar de alta 3 alumnos\n" +
                    "2.- Modificar\n" +
                    "Selecciona una opción: \n"));
            switch (el) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Ten un buen día");
                    break;
                case 1:
                    for (int i = 0; i < 3; i++) {
                        Practica_7_1.Alumno alum = new Practica_7_1.Alumno();
                        alum.setMatr(pDat((i+1) + ".-" + " Matricula: "));
                        alum.setNomb(pDat((i+1) + ".-" + " Nombre: "));
                        alum.setaPat(pDat((i+1) + ".-" + " Apellido Paterno: "));
                        alum.setaMat(pDat((i+1) + ".-" + " Apellido Materno: "));
                        alum.setEdad(Integer.parseInt(pDat( (i+1) + ".- " + " Edad: ")));
                        datos.add(alum);
                    }
                    break;
                case 2:
                    elAlu = Integer.parseInt(JOptionPane.showInputDialog("Elige la opción: \n" +
                            "1.- Modificar Alumno 1\n" +
                            "2.- Modificar ALumon 2\n" +
                            "3.- Modificar Alumno 3\n" +
                            "Selecciona una opción: \n"));
                   switch (elAlu){
                       case 1:
                           Practica_7_1.Alumno alumno = datos.get(0);
                           alumno.setNomb(pDat("Modifica el nombre del Alumno 1: "));
                           break;
                       case 2:
                           Practica_7_1.Alumno alumno2 = datos.get(1);
                           alumno2.setNomb(pDat("Modifica el nombre del Alumno 2: "));
                           int eAct = alumno2.getEdad();
                           alumno2.setEdad(eAct + 5);
                           break;
                       case 3:
                           Practica_7_1.Alumno alumno3 = datos.get(2);
                           alumno3.setNomb(pDat("Modifica el nombre del Alumno 3: "));
                           break;
                       default:
                           break;
                   }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no disponible");
                    break;
            }
            String men = "Alumnos registrados:\n \n";
            for (int i = 0; i < datos.size(); i++) {
                Practica_7_1.Alumno a = datos.get(i);
                men += "Alumno " + (i + 1) + ": \n" + a.toString() + "\n";
            }
            JOptionPane.showMessageDialog(null, men);
        }while (el!=0);
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
}
