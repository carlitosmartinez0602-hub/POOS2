package Unidad_4.Practica_7;

public class CD extends Publicacion {
    private double tiempoReproduccion;

    public CD(String titulo, double precio, double tiempoReproduccion) {
        super(titulo, precio);
        this.tiempoReproduccion = tiempoReproduccion;
    }

    public double getTiempoReproduccion() {
        return tiempoReproduccion;
    }

    public void setTiempoReproduccion(double tiempoReproduccion) {
        this.tiempoReproduccion = tiempoReproduccion;
    }

    @Override
    public String toString() {
        return "|-----Audiolibro (CD)-----|\n" +
                super.toString() +
                "\nTiempo de reproducción: " + tiempoReproduccion + " minutos";
    }
}