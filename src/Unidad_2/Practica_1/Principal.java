package Unidad_2.Practica_1;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        long n=0, n2=0, n3=0;
        int el = Integer.parseInt(JOptionPane.showInputDialog(null,
                "0.- Salir\n" +
                "1.- Factorial (20 o menor)\n" +
                "2.- Suma\n" +
                "3.- Logarimo\n" +
                "4.- Resta\n" +
                "5.- Mayor de dos numeros\n" +
                "6.- Par o Impar\n" +
                "7.- Es primo\n" +
                "8.- Promedio\n" +
                "9.- Inverso de un número\n" +
                "10.- Suma de dígitos\n" +
                "\nSelecciona la opción"));

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
            case 5:
                n = Long.parseLong(JOptionPane.showInputDialog(null, "Dame un número: "));
                n2 = Long.parseLong(JOptionPane.showInputDialog(null, "Dame un segundo número: "));

                Practica_1_1.Matematicas mayMen = new Practica_1_1.Matematicas();
                JOptionPane.showMessageDialog(null, "El mayor es: " + mayMen.mayorDosNumeros(n,n2));
                break;
            case 6:
                n = Long.parseLong(JOptionPane.showInputDialog(null, "Dame un número: "));
                Practica_1_1.Matematicas par = new Practica_1_1.Matematicas();
                JOptionPane.showMessageDialog(null, "El numero: "+ n + " es " + par.esPar(n));
                break;
            case 7:
                n = Long.parseLong(JOptionPane.showInputDialog(null, "Dame un número: "));
                Practica_1_1.Matematicas primo = new Practica_1_1.Matematicas();
                JOptionPane.showMessageDialog(null, "El número " + n + primo.esPrimo(n));
                break;
            case 8:
                n = Long.parseLong(JOptionPane.showInputDialog(null, "Dame un número: "));
                n2 = Long.parseLong(JOptionPane.showInputDialog(null, "Dame un segundo número: "));
                n3 = Long.parseLong(JOptionPane.showInputDialog(null, "Dame un tercer número: "));
                Practica_1_1.Matematicas prom = new Practica_1_1.Matematicas();
                JOptionPane.showMessageDialog(null, "Promedio: " + prom.calcularPromedio(n,n2,n3));
                break;
            case 9:
                String nS = JOptionPane.showInputDialog(null, "Dame un número: ");
                Practica_1_1.Matematicas inverso = new Practica_1_1.Matematicas();
                String txtIn = inverso.invertirNumero(nS);
                long NL = Long.parseLong(txtIn);
                JOptionPane.showMessageDialog(null, "El inverso de: " + nS +" es " + NL);
                break;
            case 10:
                n = Long.parseLong(JOptionPane.showInputDialog(null, "Dame un número"));
                Practica_1_1.Matematicas sumaD = new Practica_1_1.Matematicas();
                JOptionPane.showMessageDialog(null, "La suma de " + n + " es: " + sumaD.sumaDigitos(n));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida :(");
        }
    }
}