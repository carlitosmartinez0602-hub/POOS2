package Unidad_2.Practica_14;

public class Materia {
    private String clave;
    private String nombre;
    private double calificacion;

    public Materia() {
        this.calificacion = -1;
    }

    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getCalificacion() { return calificacion; }
    public void setCalificacion(double calificacion) throws CalificacionInvalidaException {
        if (calificacion < 0 || calificacion > 100) {
            throw new CalificacionInvalidaException("Calificación debe ser entre 0 y 100");
        }
        this.calificacion = calificacion;
    }

    public String toString() {
        if (calificacion == -1) {
            return clave + " - " + nombre + " (Sin calificación)";
        } else {
            return clave + " - " + nombre + " (" + calificacion + ")";
        }
    }
}