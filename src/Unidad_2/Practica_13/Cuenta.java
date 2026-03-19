package Unidad_2.Practica_13;

public class Cuenta {
    private Titular titular;
    private float saldo;

    public Cuenta(Titular titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public Cuenta(Titular titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void ingresar(float monto){

    }
}
