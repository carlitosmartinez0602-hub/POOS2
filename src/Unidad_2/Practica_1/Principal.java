package Unidad_2.Practica_1;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        long n=0;
        int el = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1.- Factorial\n" +
                "2.- Suma\n" +
                "3.- Logarimo\n" +
                "Selecciona la opción"));


        switch (el){
            case 1:

                if (n > 20) {
                    JOptionPane.showMessageDialog(null, "Excede la memoria");
                    return;
                } else if (n < 0) {
                    JOptionPane.showMessageDialog(null, "No se puede calcular el factorial" +
                            " de un número negativo");
                    return;
                }

                n=Long.parseLong(JOptionPane.showInputDialog(null, "Dame un número: "));
                Practica_1_1.Matematicas facto = new Practica_1_1.Matematicas();
                JOptionPane.showMessageDialog(null, "Resultado: " + facto.factorial(n));

                break;
            case 2:
                n=Long.parseLong(JOptionPane.showInputDialog(null, "Dame un número: "));
                long n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame " +
                        "un segundo número: "));
                Practica_1_1.Matematicas sum = new Practica_1_1.Matematicas();
                JOptionPane.showMessageDialog(null, "Resultado: " +sum.suma(n,n2));

                break;
            case 3:
                double fnlog=0;

                if (n <0) {
                    JOptionPane.showMessageDialog(null, "No existen logaritmos " +
                            "de números negativos");
                    return;
                }
                n=Long.parseLong(JOptionPane.showInputDialog(null, "Dame un número: "));

                Practica_1_1.Matematicas loga = new Practica_1_1.Matematicas();

                JOptionPane.showMessageDialog(null, "Resultado: " + loga.logaritmoNatural(n));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida :(");
        }
    }
}