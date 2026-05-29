package Unidad_4.Practica_5;

public class ProductosCongelados extends Productos{
    private String packingDate;
    private String countryOfOrigin;
    private double suggestedTemperature;

    public ProductosCongelados(String expirationDate, int batchNumber, String packingDate, String countryOfOrigin, double suggestedTemperature) {
        super(expirationDate, batchNumber);
        this.packingDate = packingDate;
        this.countryOfOrigin = countryOfOrigin;
        this.suggestedTemperature = suggestedTemperature;
    }

    public String getPackingDate() {
        return packingDate;
    }

    public void setPackingDate(String packingDate) {
        this.packingDate = packingDate;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public double getSuggestedTemperature() {
        return suggestedTemperature;
    }

    public void setSuggestedTemperature(double suggestedTemperature) {
        this.suggestedTemperature = suggestedTemperature;
    }

    @Override
    public String toString() {
        return super.toString() +
                        "\nFecha de envase: " + packingDate +
                "\nPaís de origen: " + countryOfOrigin +
                "\nTemperatura sugerida: " + suggestedTemperature + "º";
    }
}
