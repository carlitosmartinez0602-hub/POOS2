package Unidad_4.Practica_5;

public class PCongeladoNitrogeno extends ProductosCongelados{
    private String freezingMethod;
    private double expositionTime;

    public PCongeladoNitrogeno(String expirationDate, int batchNumber, String packingDate, String countryOfOrigin, double suggestedTemperature, String freezingMethod, double expositionTime) {
        super(expirationDate, batchNumber, packingDate, countryOfOrigin, suggestedTemperature);
        this.freezingMethod = freezingMethod;
        this.expositionTime = expositionTime;
    }

    @Override
    public String toString() {
        return
                "\n|-----Producto Congelado por Nitrogeno-----|\n" +
                        super.toString() +
                        "\nMetodo de enfriado: " + freezingMethod +
                "\nTiempo de exposición: " + expositionTime + " segundos";
    }
}
