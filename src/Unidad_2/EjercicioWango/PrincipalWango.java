package Unidad_2.EjercicioWango;

import javax.swing.*;

public class PrincipalWango {
    static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria(" ", 0);
        String titular = pDat("Nombre del titular");
        double saldo = Integer.parseInt(pDat("Saldo inicial"));

        do {
            int el = Integer.parseInt(pDat(
                    "0.- Salir\n" +
                            "1.- depositar\n" +
                            "2.- Retirar\n" +
                            "3.- Consultar saldo\n" +
                            "Selecciona la opción\n"
            ));

            switch (el){
                case 0:
                    dInf("ten un buen día");
                    break;
                case 1:
                    dInf("Depositar");
                    break;
                case 2:
                    double mntRet = Double.parseDouble(pDat("Monto a retirar"));
                    try{
                        c1.retirar(mntRet);
                    } catch (SaldoInsuficienteException e) {
                        dInf(e.getMessage());
                    }
                    break;
                case 3:
                    dInf("Titular" + c1.getTitular() + "\nSaldo: " + c1.getSaldo());
                    break;
                default:
                    dInf("Opción no válida");
            }
        }while (true);
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static String dInf(String txt){
        JOptionPane.showMessageDialog(null, txt);
        return " ";
    }
}
