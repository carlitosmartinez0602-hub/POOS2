package Unidad_5.PreExamenU5.PreExamen_3;

public class Autobus extends Vehiculo {
    private double precioPorKM;
    private int cantidadKMrentado;
    private int CantidadKMdevuelto;

    public Autobus(String placas, boolean alquilado, double precioPorKM, int cantidadKMrentado, int cantidadKMdevuelto) {
        super(placas);
        this.precioPorKM = precioPorKM;
        this.cantidadKMrentado = cantidadKMrentado;
        this.CantidadKMdevuelto = cantidadKMdevuelto;
    }

    public double getPrecioPorKM() {
        return precioPorKM;
    }

    public void setPrecioPorKM(double precioPorKM) {
        this.precioPorKM = precioPorKM;
    }

    public int getCantidadKMrentado() {
        return cantidadKMrentado;
    }

    public void setCantidadKMrentado(int cantidadKMrentado) {
        this.cantidadKMrentado = cantidadKMrentado;
    }

    public int getCantidadKMdevuelto() {
        return CantidadKMdevuelto;
    }

    public void setCantidadKMdevuelto(int cantidadKMdevuelto) {
        CantidadKMdevuelto = cantidadKMdevuelto;
    }

    public void rentar(){
        if (!alquilado) {
            
        }
    }

    @Override
    public String toString() {
        return "|-----Autobus-----|" +
                super.toString() +
                "\nPrecio por kilometro: " + precioPorKM +
                "\nCantidad de kilometros recorridos durante la renta: " + cantidadKMrentado +
                "\nCantidad de kilometros recorridos durante la devolución: " + CantidadKMdevuelto;
    }
}
