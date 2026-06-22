package Unidad_5.PreExamenU5.PreExamen_3;

public class Tractor extends Vehiculo{
    private double precioPorDia;
    private String fechaRenta;
    private String fechaDevolucion;

    public Tractor(String placas, boolean alquilado, double precioPorDia, String fechaRenta, String fechaDevolucion) {
        super(placas);
        this.precioPorDia = precioPorDia;
        this.fechaRenta = fechaRenta;
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public String getFechaRenta() {
        return fechaRenta;
    }

    public void setFechaRenta(String fechaRenta) {
        this.fechaRenta = fechaRenta;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "|-----Tractor-----|" +
                super.toString() +
                "\nPrecio por día: " + precioPorDia +
                "\nFecha de renta: " + fechaRenta +
                "\nFecha de devolución: " + fechaDevolucion;
    }
}
