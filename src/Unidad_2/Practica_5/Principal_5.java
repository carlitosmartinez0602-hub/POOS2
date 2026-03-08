package Unidad_2.Practica_5;

import javax.swing.*;

public class Principal_5 {
    static void main(String[] args) {
        int el=0;
        int n1=0,n2=0;
        Practica_5_1.Calculadora calc = new Practica_5_1.Calculadora();
        do {
            el = Integer.parseInt(JOptionPane.showInputDialog("Opciones:\n" +
                    "\n0.- Salir\n" +
                    "1.- Suma\n" +
                    "2.- Resta\n" +
                    "3.- Multiplicación\n" +
                    "4.- División\n" +
                    "\nSelecciona la operación: "));
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número: "));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro número"));
            switch (el){
                case 0:
                    JOptionPane.showMessageDialog(null, "Ten un buen día :)");
                    return;
                case 1:
                    calc.setN1(n1);
                    calc.setN2(n2);
                    calc.suma();
                    JOptionPane.showMessageDialog(null, "Resultado: " + calc.getFn());
                    break;
                case 2:
                    calc.setN1(n1);
                    calc.setN2(n2);
                    calc.resta();
                    JOptionPane.showMessageDialog(null, "Resultado: " + calc.getFn());
                    break;
                case 3:
                    calc.setN1(n1);
                    calc.setN2(n2);
                    calc.multiplicacion();
                    JOptionPane.showMessageDialog(null, "Resultado: " + calc.getFn());
                    break;
                case 4:
                    calc.setN1(n1);
                    calc.setN2(n2);
                    calc.division();
                    JOptionPane.showMessageDialog(null, "Resultado: " + calc.getFn());
                    break;
                default:
                    break;
            }
        }while (true);
    }
}
