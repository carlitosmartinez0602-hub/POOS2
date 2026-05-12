package Unidad_3.Practica_2;

public class LibroInexistenteException extends Exception{
    public LibroInexistenteException(String msg){
        super("Primero debes crear el libro");
    }
}
