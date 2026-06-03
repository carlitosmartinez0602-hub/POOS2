package Unidad_4.Practica_3;

import javax.swing.*;
import java.util.ArrayList;

public class MainJugadores {
    static void main(String[] args) {
        int el = 0;
        ArrayList<Jugador> listaJugadores = new ArrayList<>();

        do {
            String input = pDat("|-----Opciones-----|\n" +
                    "\n0.- Salir" +
                    "\n1.- Dar de alta a 5 jugadores" +
                    "\n2.- Goles anotados por el equipo" +
                    "\n3.- Cantidad de minutos jugados" +
                    "\n4.- Datos de los jugadores");

            if (input == null || input.isBlank()) {
                dInf("No puede quedar en blanco");
            } else {
                try {
                    el = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    dInf("Solo numeros");
                }
            }

            switch (el) {
                case 0:
                    dInf("Adios");
                    break;
                case 1:
                    if (listaJugadores.size() >= 5) {
                        dInf("No se pueden agregar mas jugadores");
                        break;
                    }
                    //listaJugadores = null;

                    // portero
                    int numPortero = Integer.parseInt(pDat("Numero del portero: "));
                    String nomPortero = pDat("Nombre del portero: ");
                    int tallaPortero = Integer.parseInt(pDat("Talla del portero: "));
                    int edadPortero = Integer.parseInt(pDat("Edad del portero: "));
                    int minPortero = Integer.parseInt(pDat("Tiempo de juego del portero: "));
                    Portero portero = new Portero(numPortero, nomPortero, tallaPortero, edadPortero, minPortero);
                    listaJugadores.add(portero);
                    dInf("Portero creado con éxito");

                    // defensa
                    int numDefensa = Integer.parseInt(pDat("Numero del defensa: "));
                    String nomDefensa = pDat("Nombre del defensa: ");
                    int tallaDefensa = Integer.parseInt(pDat("Talla del defensa: "));
                    int edadDefensa = Integer.parseInt(pDat("Edad del defensa: "));
                    int minDefensa = Integer.parseInt(pDat("Tiempo de juego del defensa: "));
                    int golesDefensa = Integer.parseInt(pDat("Goles del defensa: "));
                    Defensa defensa = new Defensa(numDefensa, nomDefensa, tallaDefensa, edadDefensa, golesDefensa, minDefensa);
                    listaJugadores.add(defensa);
                    dInf("Defensa creado con éxito");


                    // medio
                    int numMedio = Integer.parseInt(pDat("Numero del medio: "));
                    String nomMedio = pDat("Nombre del medio: ");
                    int tallaMedio = Integer.parseInt(pDat("Talla del medio: "));
                    int edadMedio = Integer.parseInt(pDat("Edad del medio: "));
                    int minMedio = Integer.parseInt(pDat("Tiempo de juego del medio: "));
                    int golesMedio = Integer.parseInt(pDat("Goles del medio: "));
                    Medio medio = new Medio(numMedio, nomMedio, tallaMedio, edadMedio, golesMedio, minMedio);
                    listaJugadores.add(medio);
                    dInf("Medio creado con éxito");


                    // delantero 1
                    int numDelantero1 = Integer.parseInt(pDat("Numero del delantero 1: "));
                    String nomDelantero1 = pDat("Nombre del delantero 1: ");
                    int tallaDelantero1 = Integer.parseInt(pDat("Talla del delantero 1: "));
                    int edadDelantero1 = Integer.parseInt(pDat("Edad del delantero 1: "));
                    int minDelantero1 = Integer.parseInt(pDat("Tiempo de juego del delantero 1: "));
                    int golesDelantero1 = Integer.parseInt(pDat("Goles del delantero 1: "));
                    Delantero delantero1 = new Delantero(numDelantero1, nomDelantero1, tallaDelantero1, edadDelantero1, golesDelantero1, minDelantero1);
                    listaJugadores.add(delantero1);
                    dInf("Primer delantero creado con éxito");


                    // delantero 2
                    int numDelantero2 = Integer.parseInt(pDat("Numero del delantero 2: "));
                    String nomDelantero2 = pDat("Nombre del delantero 2: ");
                    int tallaDelantero2 = Integer.parseInt(pDat("Talla del delantero 2: "));
                    int edadDelantero2 = Integer.parseInt(pDat("Edad del delantero 2: "));
                    int minDelantero2 = Integer.parseInt(pDat("Tiempo de juego del delantero 2: "));
                    int golesDelantero2 = Integer.parseInt(pDat("Goles del delantero 2: "));
                    Delantero delantero2 = new Delantero(numDelantero2, nomDelantero2, tallaDelantero2, edadDelantero2, golesDelantero2, minDelantero2);
                    listaJugadores.add(delantero2);
                    dInf("Segundo delantero creado con éxito");


                    dInf("Los 5 jugadores se crearon con éxito");
                    break;

                case 2:
                    if (listaJugadores.isEmpty()) {
                        dInf("No hay jugadores registrados");
                        break;
                    }
                    int totalGoles = 0;
                    String msgGoles = "|-----Goles del equipo-----|\n\n";

                    for (int i = 0; i < listaJugadores.size(); i++) {
                        Jugador j = listaJugadores.get(i);
                        if (j instanceof Portero) {
                            msgGoles += j.getName() + " (Portero): 0 goles\n";
                        } else if (j instanceof Defensa) {
                            Defensa d = (Defensa) j;
                            totalGoles += d.getGoalsScored();
                            msgGoles += d.getName() + " (Defensa): " + d.getGoalsScored() + " goles\n";
                        } else if (j instanceof Medio) {
                            Medio m = (Medio) j;
                            totalGoles += m.getGoalsScored();
                            msgGoles += m.getName() + " (Medio): " + m.getGoalsScored() + " goles\n";
                        } else if (j instanceof Delantero) {
                            Delantero d = (Delantero) j;
                            totalGoles += d.getGoalsScored();
                            msgGoles += d.getName() + " (Delantero): " + d.getGoalsScored() + " goles\n";
                        }
                    }

                    msgGoles += "\nTotal de goles: " + totalGoles;
                    dInf(msgGoles);
                    break;

                case 3:
                    if (listaJugadores.isEmpty()) {
                        dInf("No hay jugadores registrados");
                        break;
                    }
                    int totalMinutos = 0;
                    String msgMinutos = "|-----Minutos jugados-----|\n\n";

                    for (int i = 0; i < listaJugadores.size(); i++) {
                        Jugador j = listaJugadores.get(i);

                        if (j instanceof Portero) {
                            Portero p = (Portero) j;
                            totalMinutos += p.getMinutesPlayed();
                            msgMinutos += p.getName() + " (Portero): " + p.getMinutesPlayed() + " minutos\n";
                        } else if (j instanceof Defensa) {
                            Defensa d = (Defensa) j;
                            totalMinutos += d.getMinutesPlayed();
                            msgMinutos += d.getName() + " (Defensa): " + d.getMinutesPlayed() + " minutos\n";
                        } else if (j instanceof Medio) {
                            Medio m = (Medio) j;
                            totalMinutos += m.getMinutesPlayed();
                            msgMinutos += m.getName() + " (Medio): " + m.getMinutesPlayed() + " minutos\n";
                        } else if (j instanceof Delantero) {
                            Delantero d = (Delantero) j;
                            totalMinutos += d.getMinutesPlayed();
                            msgMinutos += d.getName() + " (Delantero): " + d.getMinutesPlayed() + " minutos\n";
                        }
                    }
                    msgMinutos += "\nTotal de minutos: " + totalMinutos;
                    dInf(msgMinutos);
                    break;
                case 4:
                    if (listaJugadores.isEmpty()) {
                        dInf("No hay jugadores registrados");
                        break;
                    }
                    String msgDatos = "|-----Datos de los jugadores-----|\n";

                    for (int i = 0; i < listaJugadores.size(); i++) {
                        Jugador j = listaJugadores.get(i);
                        msgDatos += j.toString();
                    }
                    dInf(msgDatos);
                    break;
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