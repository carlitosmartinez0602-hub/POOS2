package Unidad_2.Pre_Examen3U2;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(int capacidadMaxima) throws CafeNegativoException{
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
        if (capacidadMaxima < 0){
            throw new CafeNegativoException("¡El café no puede ser negativo!");
        }

    }
        public Cafetera(int capacidadMaxima, int cantidadActual) throws CafeNegativoException{
            this.capacidadMaxima = capacidadMaxima;
            if (capacidadMaxima < 0 || cantidadActual < 0) {
                throw new CafeNegativoException("¡El café no puede ser negativo!");
            }
            if (cantidadActual > capacidadMaxima) {
                this.cantidadActual = capacidadMaxima;
            }else {
                this.cantidadActual = cantidadActual;
            }
        }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera(){
        this.cantidadActual = capacidadMaxima;
    }

    public void servirTaza(int TT) throws CafeServidoInvalidoException{
        if (TT <= 0) {
            throw new CafeServidoInvalidoException("¡La cantidad de café debe ser mayor a cero y no puede ser negativa!");
        }
        if (cantidadActual== 0) {
            throw new CafeServidoInvalidoException("¡No puedes servir lo que no existe!");
        }
        if (cantidadActual >= TT) {
            cantidadActual -= TT;
        }else{
            cantidadActual = 0;
        }
    }
    public void vaciarCafetera(){
        cantidadActual = 0;
    }
    public void agregarCafe(int cantidad) throws CafeAgregadoInvalidoException{
        if (cantidad <= 0) {
            throw new CafeAgregadoInvalidoException("¡La cantidad de café debe ser mayor a cero y no puede ser negativa!");
        }
        if (cantidadActual + cantidad > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
            throw new CafeAgregadoInvalidoException("¡No puedes agregar más de la capacidad máxima!");
        }else {
            cantidadActual += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Cafetera: \n" +
                "Capacidad Máxiama: " + capacidadMaxima
                + "\n Cantidad Actual: " + cantidadActual;
    }
}
