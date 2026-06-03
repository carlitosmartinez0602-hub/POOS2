package Unidad_4.Polimorfismo.Practica_2;

import javax.swing.*;

public class JefeDeZona extends Empleado {
    private String dispatch;
    private Auto auto;
    private Secretario secretary;
    private Vendedor[] vendors;

    public JefeDeZona(String cipher, String name, String lastName, String direction, int yearsOfService,
                      int telephone, double salary, Empleado supervisor, String dispatch,
                      Auto auto, Secretario secretary) {

        super(cipher, name, lastName, direction, yearsOfService, telephone, salary, supervisor);

        this.dispatch = dispatch;
        this.auto = auto;
        this.secretary = secretary;
        this.vendors = new Vendedor[2];
    }

    public void annualSalaryIncrease() {
        double nuevoSalario = this.getSalary() * 1.20;
        this.setSalary(nuevoSalario);
    }

    public void changeSecretary(Secretario nuevoSecretario) {
        this.secretary = nuevoSecretario;
        JOptionPane.showMessageDialog(null, "El secretario a cargo ha sido cambiado con éxito.");
    }

    public void changeAuto(Auto newCar) {
        this.auto = newCar;
        JOptionPane.showMessageDialog(null, "El coche del Jefe de Zona ha sido actualizado con éxito.");
    }

    public void addVendor(Vendedor newVendor) {
        for (int i = 0; i < vendors.length; i++) {
            if (vendors[i] == null) {
                vendors[i] = newVendor;
                JOptionPane.showMessageDialog(null, "Vendedor '" + newVendor.getSalary() + "' (u otro dato de identificación) asignado a la zona con éxito.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Error: La zona ya tiene asignado el límite máximo de 2 vendedores.");
    }

    public void removeVendor(Vendedor removedVendor) {
        for (int i = 0; i < vendors.length; i++) {
            if (vendors[i] != null && vendors[i].equals(removedVendor)) {
                vendors[i] = null;
                JOptionPane.showMessageDialog(null, "Vendedor removido de la zona correctamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Error: El vendedor especificado no se encuentra trabajando en esta zona.");
    }

    @Override
    public String toString() {
        String vendorsList = "";
        for (int i = 0; i < vendors.length; i++) {
            vendorsList += "\n  " + (i + 1) + ". " + (vendors[i] != null ? vendors[i].getSalary() : "[Vacío]");
        }

        return super.toString() +
                "|-----Jefe de Zona-----|" +
                "\nDespacho: " + dispatch +
                "\nVehículo Asignado: " + (auto != null ? auto.toString() : "Ninguno") +
                "\nSecretario a Cargo: " + (secretary != null ? "Asignado" : "Ninguno") +
                "\nVendedores en su Zona (Máx. 2):" + vendorsList;
    }
}
