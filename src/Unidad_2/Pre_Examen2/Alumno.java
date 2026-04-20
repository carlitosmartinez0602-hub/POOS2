package Unidad_2.Pre_Examen2;

public class Alumno {
    private String nombre;
    private int edad;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + "\n" +
                "Edad: " + edad ;
    }
}
