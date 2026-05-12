package Unidad_3.Practica_1;

public class LimiteDepException extends Exception{
    public LimiteDepException(){
        super("¡Se ha excedido el limite de departamentos! (4)");
    }
}
