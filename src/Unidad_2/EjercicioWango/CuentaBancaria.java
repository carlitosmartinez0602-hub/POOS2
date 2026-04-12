package Unidad_2.EjercicioWango;

import javax.swing.*;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double cantidad){
        if (cantidad > 0) {
            saldo += cantidad;
            JOptionPane.showMessageDialog(null,"Depósito exitoso!");
        }else{
            JOptionPane.showMessageDialog(null, "El saldo debe ser positivo!");
        }
    }

    public void retirar(double cantidad) throws SaldoInsuficienteException{
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("No hay suficiente saldo :(");
        }else {
            saldo -= cantidad;
            JOptionPane.showMessageDialog(null, "Retiro exitoso | Nuevo saldo: " + saldo);
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
