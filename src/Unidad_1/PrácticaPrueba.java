package Unidad_1;

public class PrácticaPrueba {
    // Atributos
    private String Nombre;
    private int Edad;

    // Constructor
    public PrácticaPrueba(String Nombre, int Edad){
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    // Método
    public void Saludar() {
        System.out.println("Hola, soy " + Nombre + " y tengo " + Edad + " años.");
    }
}
