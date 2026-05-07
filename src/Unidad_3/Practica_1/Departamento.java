package Unidad_3.Practica_1;

public class Departamento {

    private int numero;
    private String nombre;
    private String nombreJefe;

    public Departamento() {
        numero = 0;
        nombre = "";
        nombreJefe = "";
    }

    public Departamento(int numero, String nombre, String nombreJefe) {
        this.numero = numero;
        this.nombre = nombre;
        this.nombreJefe = nombreJefe;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreJefe() {
        return nombreJefe;
    }

    public void setNombreJefe(String nombreJefe) {
        this.nombreJefe = nombreJefe;
    }

    public String mostrarDepartamento() {
        return "Número: " + numero +
                "\nNombre: " + nombre +
                "\nJefe: " + nombreJefe;
    }
}