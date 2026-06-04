package Unidad_4.Polimorfismo.Practica_2;

import javax.swing.*;

public class Empleado {
    private String cipher;
    private String name;
    private String lastName;
    private String direction;
    private int yearsOfService;
    private String telephone;
    private double salary;
    private Empleado supervisor;

    public Empleado(String cipher, String name, String lastName, String direction, int yearsOfService, String telephone, double salary, Empleado supervisor) {
        this.cipher = cipher;
        this.name = name;
        this.lastName = lastName;
        this.direction = direction;
        this.yearsOfService = yearsOfService;
        this.telephone = telephone;
        this.salary = salary;
        this.supervisor = supervisor;
    }

    public void ChangeSupervisor(Empleado newSupervisor){
        this.supervisor = newSupervisor;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "|-----Empleado-----|" +
                "\nClave: " + cipher +
                "\nNombre: " + name +
                "\nApellidos: " + lastName +
                "\nDirección: " + direction +
                "\nAntigüedad: " + yearsOfService +
                "\nTelefono: " + telephone +
                "\nSalario: " + salary +
                "\nSupervisor: " + supervisor;
    }
}
