package Unidad_2.Practica_13;

public class montoNegativoException extends Exception{
    public montoNegativoException(String message) {
        super("No se aceptan montos negativos :(");
    }
}
