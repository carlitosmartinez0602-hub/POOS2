package Unidad_2.Practica_8;

public class vehiculo {
    public static class Vehiculo {

        private String placas;
        private String marca;
        private String modelo;
        private int precio;

        public Vehiculo() {
            this.placas = null;
            this.marca = null;
            this.modelo = null;
            this.precio = 0;
        }

        public Vehiculo(String placas, String marca, String modelo, int precio) {
            this.placas = placas;
            this.marca = marca;
            this.modelo = modelo;
            this.precio = precio;
        }

        public Vehiculo(String modelo){
            this.placas = null;
            this.marca = null;
            this.modelo = modelo;
            this.precio = 0;
        }

        public String getPlacas() {
            return placas;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public int getPrecio() {
            return precio;
        }

        public void setPlacas(String placas) {
            this.placas = placas;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public void setPrecio(int precio) {
            this.precio = precio;
        }

        @Override
        public String toString() {
            return "placas: " + placas + "\n marca: " + marca + "\n modelo: " + modelo + "\n precio: " + precio;
        }
    }
}
