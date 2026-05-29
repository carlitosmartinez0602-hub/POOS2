package Unidad_4.Practica_5;

public class ProductosFrescos extends Productos{
    private String countryOfOrigin;
    private String packingDate;

    public ProductosFrescos(String expirationDate, int batchNumber, String countryOfOrigin, String packingDate) {
        super(expirationDate, batchNumber);
        this.countryOfOrigin = countryOfOrigin;
        this.packingDate = packingDate;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getPackingDate() {
        return packingDate;
    }

    public void setPackingDate(String packingDate) {
        this.packingDate = packingDate;
    }

    @Override
    public String toString() {
        return "\n|-----Productos Frescos-----|\n" +
                        super.toString() +
                        "\nPaís de Origen: " + countryOfOrigin +
                "\nFecha de envase: " + packingDate;
    }
}
