package Unidad_2.Practica_4;

import javax.swing.*;

public class Principal_4 {
    static void main(String[] args) {
        int el=0;
        int n1=0,n2=0;
        Practica_4_1.calculadora calc = new Practica_4_1.calculadora();

        do {
            el = Integer.parseInt(JOptionPane.showInputDialog("Opciones:\n" +
                    "\n0.- Salir\n" +
                    "1.- Suma\n" +
                    "2.- Resta\n" +
                    "3.- Multiplicación\n" +
                    "4.- División\n" +
                    "\nSelecciona la operación: "));
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
            switch (el){
                case 0:
                    return;
                case 1:
                    calc.setN1(n1);
                    calc.setN2(n2);
                    calc.suma(n1,n2);
                    JOptionPane.showMessageDialog(null, "Resultado: " + calc.getFn());
                    break;
                case 2:
                    calc.setN1(n1);
                    calc.setN2(n2);
                    calc.resta(n1,n2);
                    JOptionPane.showMessageDialog(null, "Resultado: " + calc.getFn());
                    break;
                case 3:
                    calc.setN1(n1);
                    calc.setN2(n2);
                    calc.multiplicacion(n1,n2);
                    JOptionPane.showMessageDialog(null, "Resultado: " + calc.getFn());
                    break;
                case 4:
                    calc.setN1(n1);
                    calc.setN2(n2);
                    calc.division(n1,n2);
                    JOptionPane.showMessageDialog(null, "Resultado: " + calc.getFn());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no disponible :(");
                    return;
            }
        }while(true);
    }
}
