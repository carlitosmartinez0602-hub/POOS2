package Unidad_2.Practica_1;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        long n=0, n2=0;
        int el = Integer.parseInt(JOptionPane.showInputDialog(null,
                "0.- Salir\n" +
                "1.- Factorial (20 o menor)\n" +
                "2.- Suma\n" +
                "3.- Logarimo\n" +
                "4.- Resta\n" +
                "Selecciona la opción"));

        switch (el){
            case 0:
                JOptionPane.showMessageDialog(null, "Ten un buen día :)");
                return;
            case 1:

                if (n > 20) {
                    JOptionPane.showMessageDialog(null, "Excede la memoria");
                    return;
                } else if (n < 0) {
                    JOptionPane.showMessageDialog(null, "No se puede calcular el factorial" +
                            " de un número negativo");
                    return;
                }

                n = Long.parseLong(JOptionPane.showInputDialog(null, "Dame un número: "));
                Practica_1_1.Matematicas facto = new Practica_1_1.Matematicas();
                JOptionPane.showMessageDialog(null, "Resultado: " + facto.factorial(n));

                break;
            case 2:
                n = Long.parseLong(JOptionPane.showInputDialog(null, "Dame un número: "));
                n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame " +
                        "un segundo número: "));
                Practica_1_1.Matematicas sum = new Practica_1_1.Matematicas();
                JOptionPane.showMessageDialog(null, "Resultado: " + sum.suma(n,n2));

                break;
            case 3:
                n = Long.parseLong(JOptionPane.showInputDialog(null, "Dame un número: "));
                n2 = Long.parseLong(JOptionPane.showInputDialog(null, "Dame un segundo número: "));

                Practica_1_1.Matematicas res = new Practica_1_1.Matematicas();
                JOptionPane.showMessageDialog(null, "Resultado: " + res.resta(n,n2));
                break;
            case 4:

                if (n < 0) {
                    JOptionPane.showMessageDialog(null, "No existen logaritmos " +
                            "de números negativos");
                    return;
                }
                n = Long.parseLong(JOptionPane.showInputDialog(null, "Dame un número: "));

                Practica_1_1.Matematicas loga = new Practica_1_1.Matematicas();

                JOptionPane.showMessageDialog(null, "Resultado: " + loga.logaritmoNatural(n));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida :(");
        }
    }
}