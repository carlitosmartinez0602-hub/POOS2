package Unidad_3.Practica_1;

public class NumeroDepInvalidoException extends Exception{
    public NumeroDepInvalidoException(){
        super("¡El número no puede ser negativo o cero!");
    }
}
