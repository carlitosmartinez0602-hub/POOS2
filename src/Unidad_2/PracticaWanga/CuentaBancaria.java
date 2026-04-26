package Unidad_2.PracticaWanga;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria() {
        this.saldo = 0;
    }

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double cantidad) throws CantidadInvalidaException{
        if (cantidad <= 0) {
            throw new CantidadInvalidaException("¡La cantidad depositada deber ser mayor a cero" +
                    "y no puede ser negativa!");
        }
        return saldo += cantidad;
    }

    public double retirar(double cantidad) throws SaldoInsuficineteException, CantidadInvalidaException{
        if (cantidad <= 0) {
            throw new CantidadInvalidaException("¡La cantidad depositada deber ser mayor a cero" +
                    "y no puede ser negativa!");
        } else if (saldo <= 0) {
            throw new SaldoInsuficineteException("¡Saldo insuficiente!");
        }
        return saldo -=cantidad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Tu cuenta bancaria\n" +
                "Saldo actual en la cuenta: " + this.saldo;
    }
}
