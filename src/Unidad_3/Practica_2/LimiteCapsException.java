package Unidad_3.Practica_2;

public class LimiteCapsException extends Exception{
    public LimiteCapsException(String msg){
        super("¡Se sobrepasó el limite de capitulos!");
    }
}
