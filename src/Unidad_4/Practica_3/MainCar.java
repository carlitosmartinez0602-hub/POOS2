package Unidad_4.Practica_3;

import javax.swing.*;

public class MainCar {
    static void main(String[] args) {
        Car car = null;
        Car truckReferencia = null;
        Car truckReferencia2 = null;
        Ford ford1 = null;
        Ford ford2 = null;
        Sedan sedan = null;
        int el = 0;

        do {
            String input = pDat("Opciones:"
                    + "\n0.- Salir"
                    + "\n1.- Crear Sedan"
                    + "\n2.- Crear Ford 1"
                    + "\n3.- Crear Ford 2"
                    + "\n4.- Crear Car (setters)"
                    + "\n5.- Crear Truck 1 (referencia Car)"
                    + "\n6.- Crear Truck 2 (referencia Car)"
                    + "\n7.- Mostrar precios");

            if (input == null || input.isBlank()) {
                dInf("¡No puede quedar en blanco!");
            }
            try {
                el = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                dInf("¡Solo números!");
            }

            switch (el) {
                case 0:
                    dInf("Adiós");
                    break;
                case 1:
                    String colorSedan = pDat("Color del Sedan:");
                    int yearSedan = Integer.parseInt(pDat("Año del Sedan:"));
                    int discountSedan = Integer.parseInt(pDat("Descuento del fabricante:"));
                    int length = Integer.parseInt(pDat("Longitud (pies):"));

                    if (colorSedan == null || colorSedan.isBlank()) {
                        dInf("¡No puede quedar en blanco!");
                    } else {
                        sedan = new Sedan(180, 35000, colorSedan, yearSedan, discountSedan, length);
                        dInf("Sedan creado");
                    }
                    break;
                case 2:
                    String colorFord1 = pDat("Color del Ford 1:");
                    int yearFord1 = Integer.parseInt(pDat("Año del Ford 1:"));
                    int discountFord1 = Integer.parseInt(pDat("Descuento del fabricante:"));

                    if (colorFord1 == null || colorFord1.isBlank()) {
                        dInf("¡No puede quedar en blanco!");
                    } else {
                        ford1 = new Ford(200, 28000, colorFord1, yearFord1, discountFord1);
                        dInf("Ford 1 creado");
                    }
                    break;
                case 3:
                    String colorFord2 = pDat("Color del Ford 2:");
                    int yearFord2 = Integer.parseInt(pDat("Año del Ford 2:"));
                    int discountFord2 = Integer.parseInt(pDat("Descuento del fabricante:"));

                    if (colorFord2 == null || colorFord2.isBlank()) {
                        dInf("¡No puede quedar en blanco!");
                    } else {
                        ford2 = new Ford(170, 22000, colorFord2, yearFord2, discountFord2);
                        dInf("Ford 2 creado");
                    }
                    break;
                case 4:
                    car = new Car();
                    int speed = Integer.parseInt(pDat("Velocidad del Car:"));
                    double price = Double.parseDouble(pDat("Precio regular:"));
                    String colorCar = pDat("Color del Car:");

                    car.setSpeed(speed);
                    car.setRegularPrice(price);
                    car.setColor(colorCar);
                    dInf("Car creado con setters");
                    break;
                case 5:
                    int peso1 = Integer.parseInt(pDat("Peso del Truck 1:"));
                    Truck truck1 = new Truck(150, 45000, "Gris", peso1);
                    truckReferencia = truck1;
                    dInf("Truck 1 creado y guardado en referencia Car");
                    break;
                case 6:
                    int peso2 = Integer.parseInt(pDat("Peso del Truck 2:"));
                    Truck truck2 = new Truck(140, 40000, "Verde", peso2);
                    truckReferencia2 = truck2;
                    dInf("Truck 2 creado y guardado en referencia Car");
                    break;
                case 7:
                    String mensaje = "Precios de venta\n";

                    if (sedan != null) {
                        mensaje += "\nSedan: $" + sedan.getSalePrice();
                    }
                    if (ford1 != null) {
                        mensaje += "\nFord 1: $" + ford1.getSalePrice();
                    }
                    if (ford2 != null) {
                        mensaje += "\nFord 2: $" + ford2.getSalePrice();
                    }
                    if (car != null) {
                        mensaje += "\nCar: $" + car.getSalePrice();
                    }
                    if (truckReferencia != null) {
                        double precioOriginal = truckReferencia.getSalePrice();
                        double precioExtra = precioOriginal * 0.93;
                        mensaje += "\nTruck 1 (original): $" + precioOriginal;
                        mensaje += "\nTruck 1 (con 7% extra): $" + precioExtra;
                    }
                    if (truckReferencia2 != null) {
                        mensaje += "\nTruck 2 (precio de Car): $" + truckReferencia2.getSalePrice();
                    }

                    if (sedan == null && ford1 == null && ford2 == null && car == null
                            && truckReferencia == null && truckReferencia2 == null) {
                        mensaje = "No hay autos creados";
                    }

                    dInf(mensaje);
                    break;
                default:
                    dInf("Opción inválida");
            }
        } while (el != 0);
    }

    public static String pDat(String txt) {
        return JOptionPane.showInputDialog(txt);
    }

    public static void dInf(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }
}