package Unidad_2.PracticaWanga;

import javax.swing.*;

public class MainCuentaBancaria {
    static void main(String[] args) {
        int ele = 0;
        CuentaBancaria c = new CuentaBancaria(0);

        do {
            String inp = pDat("Opciones: \n" +
                    "0.- Salir\n" +
                    "1.- Depositar\n" +
                    "2.- Retirar\n" +
                    "3.- Consultar saldo\n");

            if (inp == null || inp.trim().isEmpty()) {
                ele = 0;
            } else {
                try {
                    ele = Integer.parseInt(inp.trim());
                } catch (NumberFormatException e) {
                    dInf("Ingresa un número válido");
                }
            }

            switch (ele) {
                case 1:
                    String cantDepStr = pDat("Cantidad a depositar: ");
                    if (cantDepStr == null || cantDepStr.trim().isEmpty()) {
                        dInf("Operación cancelada o cantidad vacía");
                        break;
                    }
                    try {
                        double cantDep = Double.parseDouble(cantDepStr.trim());
                        c.depositar(cantDep);
                        dInf("¡Depósito exitoso!\nNuevo saldo: " + c.getSaldo());
                    } catch (NumberFormatException e) {
                        dInf("Cantidad no válida.");
                    } catch (CantidadInvalidaException e) {
                        dInf(e.getMessage());
                    }
                    break;
                case 2:
                    String cantRetStr = pDat("Cantidad a retirar: ");
                    if (cantRetStr == null || cantRetStr.trim().isEmpty()) {
                        dInf("Operación cancelada o cantidad vacía");
                        break;
                    }
                    try {
                        double cantRet = Double.parseDouble(cantRetStr.trim());
                        c.retirar(cantRet);
                        dInf("¡Retiro exitoso!\nNuevo saldo: " + c.getSaldo());
                    } catch (NumberFormatException e) {
                        dInf("Cantidad no válida.");
                    } catch (CantidadInvalidaException | SaldoInsuficineteException e) {
                        dInf(e.getMessage());
                    }
                    break;
                case 3:
                    dInf(c.toString());
                    break;
                default:
                    dInf("Adios");
                    break;
            }
        } while (ele != 0);
    }

    public static String pDat(String txt) {
        return JOptionPane.showInputDialog(txt);
    }

    public static void dInf(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }
}