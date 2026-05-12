package Unidad_3.Practica_1;

public class EmpresaInexistenteException extends Exception{
    public EmpresaInexistenteException(){
        super("La empresa no existe");
    }
}
