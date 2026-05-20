package Unidad_4.Practica_1;

public class Empleado {
    protected String nombre;
    protected int idEmpleado;
    protected double sueldo;

    public Empleado(String nombre, int idEmpleado, double sueldo) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }
    public Empleado() {
        this.nombre = null;
        this.idEmpleado = 0;
        this.sueldo = 0;
    }

    @Override
    public String toString() {
        return "|-----Empleado-----|\n" +
                "\nId: " +idEmpleado +
                "\nNombre: " +nombre+
                "\nSueldo: " + sueldo;
    }

    public void aumentarSueldo(){
        if (this.sueldo >= 0) {
            this.sueldo += this.sueldo * 0.10;
        }
    }
}
