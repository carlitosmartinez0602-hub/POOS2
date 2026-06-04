package Unidad_4.Polimorfismo.Practica_2;

public class Secretario extends Empleado{
    private String dispatch;
    private String faxNumber;

    public Secretario(String cipher, String name, String lastName, String direction, int yearsOfService, String telephone, double salary, Empleado supervisor, String  dispatch, String faxNumber) {
        super(cipher, name, lastName, direction, yearsOfService, telephone, salary, supervisor);
        this.dispatch = dispatch;
        this.faxNumber = faxNumber;
    }

    public void annualSalaryIncrease (){
        double newSalary = this.getSalary() * 1.05;
        this.setSalary(newSalary);
    }

    @Override
    public String toString() {
        return "\n|-----Secretario-----|" +
                "\nDespacho: " + dispatch +
                "\nNúmero de fax: " + faxNumber;
    }
}
