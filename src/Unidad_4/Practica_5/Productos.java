package Unidad_4.Practica_5;

public class Productos {
    private String expirationDate;
    private int batchNumber;

    public Productos(String expirationDate, int batchNumber) {
        this.expirationDate = expirationDate;
        this.batchNumber = batchNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }

    @Override
    public String toString() {
        return "Número de lote: " + batchNumber +
                "\nFecha de expiración: " + expirationDate;
    }
}
