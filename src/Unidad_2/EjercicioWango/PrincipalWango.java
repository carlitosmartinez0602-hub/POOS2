package Unidad_2.EjercicioWango;

import javax.swing.*;

public class PrincipalWango {
    static void main(String[] args) {
        String titular = pDat("Nombre del titular");
        double saldo = Double.parseDouble(pDat("Saldo inicial"));

        CuentaBancaria c1 = new CuentaBancaria(titular, saldo);

        int el = 0;
        do {
            el = Integer.parseInt(pDat(
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
                    double mntDep = Double.parseDouble(pDat("Monto a depositar: "));
                    c1.depositar(mntDep);
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
        }while (el != 0);

    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static String dInf(String txt){
        JOptionPane.showMessageDialog(null, txt);
        return " ";
    }
}
