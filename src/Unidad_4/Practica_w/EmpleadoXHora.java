package Unidad_4.Practica_w;

public class EmpleadoXHora extends Empleado{
    private double workedHours;
    private double paymentPerHour;

    public EmpleadoXHora(String name, int id, int age, double workedHours, double paymentPerHour) {
        super(name, id, age);
        this.workedHours = workedHours;
        this.paymentPerHour = paymentPerHour;
    }
    public double CalculateSalary(){
        return  workedHours * paymentPerHour;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n|-----Salario-----|" +
                "\nHoras trabajadas: " + workedHours +
                "\nPago por hora: " + paymentPerHour +
                "\nSalario: " + CalculateSalary();
    }
}
