package Unidad_4.Polimorfismo.Practica_2;

import javax.swing.*;
import java.util.Arrays;

public class Vendedor extends Empleado{
    private Auto auto;
    private String telephone;
    private String salesArea;
    private String[] customers;
    private double percentComission;

    public Vendedor(String cipher, String name, String lastName, String direction, int yearsOfService, int telephone, double salary, Empleado supervisor, Auto auto, String telephone1, String salesArea, String[] customers, double percentComission) {
        super(cipher, name, lastName, direction, yearsOfService, telephone, salary, supervisor);
        this.auto = auto;
        this.telephone = telephone1;
        this.salesArea = salesArea;
        this.customers = new String[3];
        this.percentComission = percentComission;
    }
    public void annualSalaryIncrease(){
        double newSalary = this.getSalary() * 1.10;
        this.setSalary(newSalary);
    }
    public void ChangeAuto(Auto newCar) {
        this.auto = newCar;
        JOptionPane.showMessageDialog(null, "El coche del vendedor ha sido actualizado con éxito.");
    }
    public void addCustomer(String nombreCliente) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = nombreCliente;
                JOptionPane.showMessageDialog(null, "Cliente '" + nombreCliente + "' dado de alta con éxito.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "El vendedor ya tiene el máximo de 3 clientes asignados");
    }
        public void removeCustomer(String customerName) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].equalsIgnoreCase(customerName)) {
                customers[i] = null;
                JOptionPane.showMessageDialog(null, "Cliente '" + customerName + "' dado de baja del sistema.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró ningún cliente con el nombre '" + customerName);
    }

    @Override
    public String toString() {
        String customersList="";
        for (int i = 0; i < customersList.length(); i++) {
            customersList += "\n " + (i+1) + " ";
        }
        return "|-----Vendedor-----|" +
                "\nÁrea de Venta: " + salesArea +
                "\nTeléfono: " + telephone +
                "\n% Comisión por Ventas: " + percentComission + "%" +
                "\nAuto: " + auto +
                "\nClientes (Máx. 3):" + customersList;
    }
}

