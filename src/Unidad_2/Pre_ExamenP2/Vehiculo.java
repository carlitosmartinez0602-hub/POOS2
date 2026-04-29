package Unidad_2.Pre_ExamenP2;

import javax.swing.*;

public class Vehiculo {
    private String placas;
    private String tipo;
    private int horasEstacionadas;
    private double tarifaPH;
    private boolean dentro;
    private Validaciones val;

    public Vehiculo() {
        this.placas = null;
        this.tipo = null;
        this.horasEstacionadas = 0;
        this.tarifaPH = 0;
        this.dentro = false;
        this.val = new Validaciones();
    }

    public void ingresar(String placas, String tipo, int horasIn    ) throws VehiculoYaDentroException{
        int total=0;
        switch (this.tipo){
            case "Moto":
                this.tarifaPH = 10;
                total = (int) (tarifaPH * horasIn);
                break;
            case "Auto":
                this.tarifaPH = 20;
                break;
            case "Camioneta":
                this.tarifaPH = 35;
                break;
            default:
                JOptionPane.showMessageDialog(null,"No es pposible esa opcion");
        }
    }
    public void retirar(int horas) throws VehiculoNoDentroException, CantidadInvalidaException{

    }
    public double calcularPago(double horas) throws FormatoDeNumeroException, CantidadInvalidaException{
        double total=0;
        total *= horas;
        return total;
    }

    @Override
    public String toString() {
        return "Vehiculo: \n" +
                "Placas: " + placas + "\n" +
                "Tipo: " + tipo + "\n" +
                "Horas estacionadas: " + horasEstacionadas +
                "\nTarifa por hora: " + tarifaPH +
                "\nDentro: " + dentro;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHorasEstacionadas() {
        return horasEstacionadas;
    }

    public void setHorasEstacionadas(int horasEstacionadas) {
        this.horasEstacionadas = horasEstacionadas;
    }

    public double getTarifaPH() {
        return tarifaPH;
    }

    public void setTarifaPH(double tarifaPH) {
        this.tarifaPH = tarifaPH;
    }

    public boolean isDentro() {
        return dentro;
    }

    public void setDentro(boolean dentro) {
        this.dentro = dentro;
    }
}
