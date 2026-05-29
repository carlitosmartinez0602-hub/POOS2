package Unidad_4.Practica_3;

import javax.swing.*;

public class MainCarro {
    static void main(String[] args) {
        Sedan sedan = null;
        Ford ford1 = null;
        Ford ford2= null;
        Truck truck1 = null;
        Truck truck2=null;

        int el =0;
        do {
            String input = pDat("Opciones: \n" +
                    "0.- Salir" +
                    "\n1.- Crear Sedan" +
                    "\n2.-Crear Ford 1" +
                    "\n3.-Crear Ford 2" +
                    "\n4.-Crear Car" +
                    "\n5.-Crear Truck 1" +
                    "\n6.-Crear Truck 2" +
                    "\n7.-Precio de venta:");
            if (input == null || input.isBlank()) {
                dInf("No se puede dejar este espacio en blanco");
            }
            try {
                el = Integer.parseInt(input);
            }catch (NumberFormatException e){
                dInf("Solo se aceptan números");
            }

            switch (el){
                case 0:
                    dInf("Adios");
                    break;
                case 1:
                    String colorSedan = pDat("Color del Sedan: ");
                    int speedSedan = Integer.parseInt("Velocidad del Sedan: ");
                    int priceSedan = Integer.parseInt("Precio del Sedan: ");
                    int yearSedan = Integer.parseInt(pDat("Año del Sedan: "));
                    int discountSedan = Integer.parseInt("Descuento: ");
                    int lenghtSedan = Integer.parseInt("Longitud en pies: ");
                    double lenghtSedanCM = lenghtSedan * 30.48;
                    if (colorSedan == null || colorSedan.isBlank()) {
                        dInf("No se puede dejar este espacio en blanco");
                    }else{
                        sedan = new Sedan(speedSedan, priceSedan, colorSedan,yearSedan, discountSedan,lenghtSedan);
                        dInf("Sedan creado");
                    }
                    break;
                case 2:
                    String colorFord1 = pDat("Color del Sedan: ");
                    int speedFord1 = Integer.parseInt("Velocidad del Sedan: ");
                    int priceFord1 = Integer.parseInt("Precio del Sedan: ");
                    int yearFord1 = Integer.parseInt(pDat("Año del Sedan: "));
                    int discountFord1 = Integer.parseInt("Descuento: ");
                    int lenghtFord1 = Integer.parseInt("Longitud en pies: ");
                    double lenghtFord1CM = lenghtFord1 * 30.48;
                    if (colorFord1 == null || colorFord1.isBlank()) {
                        dInf("No se puede dejar este espacio en blanco");
                    }else{
                        ford1 = new Sedan(speedFord1, priceFord1, colorFord1, yearFord1, discountFord1,lenghtFord1);
                        dInf("Ford 1 creado");
                    }
                    break;
                case 3:
                    String colorFord2 = pDat("Color del Sedan: ");
                    int speedFord2 = Integer.parseInt("Velocidad del Sedan: ");
                    int priceFord2 = Integer.parseInt("Precio del Sedan: ");
                    int yearFord2 = Integer.parseInt(pDat("Año del Sedan: "));
                    int discountFord2 = Integer.parseInt("Descuento: ");
                    int lenghtFord2 = Integer.parseInt("Longitud en pies: ");
                    double lenghtFord2CM = lenghtFord2 * 30.48;
                    if (colorFord2 == null || colorFord2.isBlank()) {
                        dInf("No se puede dejar este espacio en blanco");
                    }else{
                        ford2 = new Sedan(speedFord2, priceFord2, colorFord2, yearFord2, discountFord2,lenghtFord2);
                        dInf("Ford 1 creado");
                    }
                    break;
                case 4:
                    Car car = new Car();
                    int speedCar = Integer.parseInt(pDat("Velocidad: "));
                    double priceCar = Double.parseDouble(pDat("Precio: "));
                    String colorCar = pDat("Color: ");

                    car.setSpeed(speedCar);
                    car.setRegularPrice(priceCar);
                    car.setColor(colorCar);
                    dInf("Car creado");
                    break;
                case 5:
                    int speedTruck = Integer.parseInt(pDat("Velocidad de la Truck: "));
                    int priceTruck = Integer.parseInt(pDat("Precio de la Truck: "));
                    String colorTruck = pDat("Color de la Truck: ");
                    int pesoTruck  = Integer.parseInt(pDat("Peso de la Truck:"));
                    truck1 = new Truck(speedTruck, priceTruck, colorTruck, pesoTruck);
                    break;
                case 6:
                    break;
            }

        }while(el!=0);
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt){
        JOptionPane.showMessageDialog(null, txt);
    }
}
