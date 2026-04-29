package Unidad_2.Pre_ExamenP2;

import javax.swing.*;

public class MainEstacionamiento {
    static void main(String[] args) {
        int el = 0;
        Vehiculo veh = new Vehiculo();
        do {
            String input = pDat("Opciones: \n" +
                    "0.- Salir\n" +
                    "1.- Regirstar vehiculo\n" +
                    "2.- Ingresar vehiculo\n" +
                    "3.- Retirar vehiculo\n" +
                    "4.- Mostra información\n");
            if (input == null || input.isBlank()) {
                el=0;
                dInf("No puedes dejarlo en blanco!");
            }else {
                try {
                    el = Integer.parseInt(input);
                }catch (FormatoDeNumeroException e){
                    dInf(e.getMessage());
                }
                switch (el){
                    case 0:
                        dInf("Adios");
                        break;
                    case 1:
                        String placas = pDat("Placas del automovil: ");
                        String tipo = pDat("Tipo de Auto (Moto, Auto, Camioneta): ");
                        String horas = pDat("Horas estacionadas: ");
                        if (placas == null || placas.isBlank() || tipo == null || tipo.isBlank()
                                || horas == null || horas.isBlank()) {
                            dInf("No puedes dejarlo en blanco");
                        }else{
                            try {
                                int total=0;
                                int horasIn = Integer.parseInt(horas);
                                veh.ingresar(placas, tipo, horasIn);
                                int horasEstacionadas = veh.getHorasEstacionadas();
                                int tarifa = (int) veh.getTarifaPH();
                                total = horasEstacionadas * tarifa;
                                dInf("Vehiculo ingresado correctamente!" + total);
                            }catch (VehiculoYaDentroException e){
                                dInf(e.getMessage());
                            }
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                }
            }
        }while (el!=0);
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt){
        JOptionPane.showMessageDialog(null,txt);
    }
}
