package Unidad_4.Practica_5;

public class PCongeladoAire extends ProductosCongelados{
    private double nitrogenPercent;
    private double oxigenPercent;
    private double carbonDioxidePercent;
    private double steamPercent;

    public PCongeladoAire(String expirationDate, int batchNumber, String packingDate, String countryOfOrigin, double suggestedTemperature, double nitrogenPercent, double oxigenPercent, double carbonDioxidePercent, double steamPercent) {
        super(expirationDate, batchNumber, packingDate, countryOfOrigin, suggestedTemperature);
        this.nitrogenPercent = nitrogenPercent;
        this.oxigenPercent = oxigenPercent;
        this.carbonDioxidePercent = carbonDioxidePercent;
        this.steamPercent = steamPercent;
    }

    @Override
    public String toString() {
        return
                "\n|-----Producto Congelado por Aire-----|\n" +
                        super.toString() +
                        "\nPorcentaje de nitrogeno: " + nitrogenPercent + " %"+
                "\nPorcentaje de oxigeno: " + oxigenPercent +" %"+
                "\nPorcentaje de dioxido de carbono: " + carbonDioxidePercent + "%"+
                "\nPorcentaje de vapor: " + steamPercent + "%";
    }
}
