package Unidad_2.Practica_8;

public class Celular {  // Nombre de clase con mayúscula
    private String marca;
    private String nSerie;
    private int precio;

    public Celular() {
        this.marca = null;
        this.nSerie = null;
        this.precio = 0;
    }

    public Celular(String marca, String nSerie, int precio) {
        this.marca = marca;
        this.nSerie = nSerie;
        this.precio = precio;
    }

    public Celular(String nSerie) {
        this.nSerie = nSerie;
    }

    public String getMarca() {
        return marca;
    }

    public String getnSerie() {
        return nSerie;
    }

    public int getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setnSerie(String nSerie) {
        this.nSerie = nSerie;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Celular{" + "marca=" + marca + ", nSerie=" + nSerie + ", precio=" + precio + '}';
    }
}