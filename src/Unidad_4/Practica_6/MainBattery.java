package Unidad_4.Practica_6;

import javax.swing.JOptionPane;

public class MainBattery {
     static void main(String[] args) {
        int el = 0;

        do {
            String input = pDat("|-----Opciones-----|\n" +
                    "\n0.- Salir" +
                    "\n1.- Probar batería");

            if (input == null || input.isBlank()) {
                dInf("No puede quedar este espacio en blanco");
            } else {
                try {
                    el = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    dInf("Solo números");
                }
            }
            switch (el) {
                case 0:
                    dInf("Adios");
                    break;
                case 1:
                    String carga = pDat("Porcentaje inicial de la batería:");
                    if (carga == null || carga.isBlank()) {
                        dInf("No puede quedar en blanco");
                        break;
                    }
                    int cargaInicial;
                    try {
                        cargaInicial = Integer.parseInt(carga);
                    } catch (NumberFormatException e) {
                        dInf("Solo números");
                        break;
                    }
                    PhoneBattery phoneBattery;
                    try {
                        phoneBattery = new PhoneBattery(cargaInicial);
                    } catch (IllegalArgumentException e) {
                        dInf(e.getMessage());
                        break;
                    }
                    boolean resultado = processBattery(phoneBattery);
                    String msg;
                    if (resultado) {
                        msg = "Estaba cargando";
                    } else {
                        msg = "No está cargando, se decrementó 3 veces";
                    }
                    dInf(msg + "\n\nEstado final: " + phoneBattery.toString());
                    break;
            }
        } while (el != 0);
    }
    public static boolean processBattery(Battery battery) {
        dInf(battery.toString());

        if (battery.isCharging()) {
            return true;
        } else {
            battery.decrementCharge();
            battery.decrementCharge();
            battery.decrementCharge();
            return false;
        }
    }
    public static String pDat(String txt) {
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }
}