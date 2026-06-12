package Unidad_5.PreExamenU5.PreExamen_2;

public class EmpleadoSinHorasExtra extends Empleado{

    public EmpleadoSinHorasExtra(int horasTrabajadas, double sueldoPorHora) {
        super(horasTrabajadas, sueldoPorHora);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario();
    }

    @Override
    public String toString() {
        return "|-----Empleado Sin Horas Extra-----|\n" +
                super.toString() +
                "\nSalario total: " + calcularSalario();
    }
}
