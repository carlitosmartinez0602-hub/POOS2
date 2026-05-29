package Unidad_4.Practica_5;

public class PCongeladoAgua extends ProductosCongelados{
    private double salinityPerLiter;

    public PCongeladoAgua(String expirationDate, int batchNumber, String packingDate, String countryOfOrigin, double suggestedTemperature, double salinityPerLiter) {
        super(expirationDate, batchNumber, packingDate, countryOfOrigin, suggestedTemperature);
        this.salinityPerLiter = salinityPerLiter;
    }

    @Override
    public String toString() {
        return
        "\n|-----Producto Congelado por Agua-----|\n" +
                super.toString() +
                "\nSalinidad por litro: " + salinityPerLiter + " g/L";
    }
}
