package Unidad_4.Practica_1;

public class Gerente extends Empleado{
    private int presupuesto;

    public Gerente(String nombre, int idEmpleado, double sueldo, int presupuesto) {
        this.presupuesto = presupuesto;
        super(nombre, idEmpleado, sueldo);
    }

}
