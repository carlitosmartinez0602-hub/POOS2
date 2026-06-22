package Unidad_5.PreExamenU5.PreExamen_3;

public class Vehiculo {
    protected String placas;
    protected boolean alquilado;

    public Vehiculo(String placas) {
        this.placas = placas;
        this.alquilado = false;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
    public boolean estaAlquilado(){
        return alquilado;
    }

    @Override
    public String toString() {
        return "\nPlacas: " + placas +
                "\n¿Alquilado?: " + alquilado;
    }
}
