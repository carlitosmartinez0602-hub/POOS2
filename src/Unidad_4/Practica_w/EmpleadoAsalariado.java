package Unidad_4.Practica_w;

public class EmpleadoAsalariado extends Empleado{
    private double monthlySalary;

    public EmpleadoAsalariado(String name, int id, int age, double monthlySalary) {
        super(name, id, age);
        this.monthlySalary = monthlySalary;
    }
    public double CalculateSalary2(){
        return monthlySalary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n|-----Salario-----|" +
                "\nSalario mensual: " + monthlySalary;
    }
}
