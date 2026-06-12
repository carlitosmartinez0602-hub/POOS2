package Unidad_5.PreExamenU5.PreExamen_2;

public class Empleado {
    private int horasTrabajadas;
    private double sueldoPorHora;

    public Empleado(int horasTrabajadas, double sueldoPorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(double sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }
    public double calcularSalario(){
        return horasTrabajadas * sueldoPorHora;
    }

    @Override
    public String toString() {
        return "\nHoras trabajadas: " + horasTrabajadas +
                "\nSueldo por hora: " + sueldoPorHora;
    }
}
