package Unidad_2.Practica_3;

import javax.swing.*;

public class Principal_3 {
    static void main(String[] args) {
        int el=0;
        double temCel =0;

        Practica_3_1.temperatura temp = new Practica_3_1.temperatura();
        do{
            el = Integer.parseInt(JOptionPane.showInputDialog("Opciones:\n\n" +
                    "0.- Salir\n" +
                    "1.- Alta de temperatura\n" +
                    "2.- Celsius a Fahrenheit\n" +
                    "3.- Celsius a Kelvin\n\n" +
                    "Selecciona la conversión"));

            switch(el){
                case 0:
                    JOptionPane.showMessageDialog(null, "Ten un buen día :)");
                    return;
                case 1:
                    temCel = Double.parseDouble(JOptionPane.showInputDialog("Grados celsius: "));
                    temp.setTemp(temCel);
                    JOptionPane.showMessageDialog(null,"Temperatura: " + temCel + " °C");
                    break;
                case 2:
                    if (temp.getTemp() == 0 && temCel == 0) {
                        JOptionPane.showMessageDialog(null,
                                "Primero debe dar de alta una temperatura (opción 1)");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "La temperatura: " + temp.getTemp() + "°C\n" + "en grados Fahrenheit es: " + temp.getgCF() + "°F");
                    }
                    break;
                case 3:
                    if (temp.getTemp() == 0 && temCel == 0) {
                        JOptionPane.showMessageDialog(null,
                                "Primero debe dar de alta una temperatura (opción 1)");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "La temperatura: " + temp.getTemp() + "°C\n" + "en grados Kelvin es: " + temp.getgCK() + "°K");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }while(el != 4);
    }
}