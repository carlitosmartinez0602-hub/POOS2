package Unidad_4.Practica_5;

public class ProductosRefrigerados extends Productos{
    private String fracCode;
    private String packingDate;
    private double suggestedTemperature;
    private String countryOfOrigin;

    public ProductosRefrigerados(String expirationDate, int batchNumber, String fracCode, String packingDate, double suggestedTemperature, String countryOfOrigin) {
        super(expirationDate, batchNumber);
        this.fracCode = fracCode;
        this.packingDate = packingDate;
        this.suggestedTemperature = suggestedTemperature;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getFracCode() {
        return fracCode;
    }

    public void setFracCode(String fracCode) {
        this.fracCode = fracCode;
    }

    public String getPackingDate() {
        return packingDate;
    }

    public void setPackingDate(String packingDate) {
        this.packingDate = packingDate;
    }

    public double getSuggestedTemperature() {
        return suggestedTemperature;
    }

    public void setSuggestedTemperature(double suggestedTemperature) {
        this.suggestedTemperature = suggestedTemperature;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString() {
        return
                "\n|-----Productos Refrigerados-----|\n" +
                        super.toString()+
                        "\nCodigo de organismo: " + fracCode +
                "\nFecha de envase: " + packingDate +
                "\nTemperatura sugerida: " + suggestedTemperature +"º" +
                "\nPaís de origen: " + countryOfOrigin;
    }
}
