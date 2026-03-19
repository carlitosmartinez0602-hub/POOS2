package Unidad_2.Practica_13;

public class montoNegativoException extends Exception{
    public montoNegativoException() {
        super("No se aceptan montos negativos :(");
    }
}
