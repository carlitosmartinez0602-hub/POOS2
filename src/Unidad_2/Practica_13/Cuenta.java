package Unidad_2.Practica_13;

public class Cuenta {
    private Titular titular;
    private float saldo;

    public Cuenta(Titular titular, float saldo) throws montoNegativoException {
        this.titular = titular;
        ingresar(saldo);
    }
    public Cuenta(Titular titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void ingresar(float monto) throws montoNegativoException{
        if (monto < 0) {
            throw new montoNegativoException();
        }else{
            this.saldo = this.saldo + monto;
        }
    }
    public void retirar(float cantidad) throws montoNegativoException{
        if (cantidad < 0) {
            throw new montoNegativoException();
        }else{
            this.saldo = this.saldo + cantidad;
        }
    }

    @Override
    public String toString() {
        return "Cuenta\n" +
                "Titular: \n" + titular +
                " Saldo del titular" + saldo;
    }
}
