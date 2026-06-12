package Unidad_5.PreExamenU5.PreExamen_2;

public class EmpleadoConHorasDoble extends Empleado{
    private int horasExtras;

    public EmpleadoConHorasDoble(int horasTrabajadas, double sueldoPorHora, int horasExtras) {
        super(horasTrabajadas, sueldoPorHora);
        this.horasExtras = horasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = 40 * getSueldoPorHora();
        return salarioBase + (horasExtras * getSueldoPorHora() * 2);
    }

    @Override
    public String toString() {
        return "\n|-----Empleado Con Horas Dobles-----|\n" +
                super.toString() +
                "\nHoras extras: " + horasExtras+
                "\nSalario total: " + calcularSalario();
    }
}
