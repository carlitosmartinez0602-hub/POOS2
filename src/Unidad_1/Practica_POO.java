package Unidad_1;

import javax.swing.*;

public class Practica_POO {
    public static class Animal{
        String Nombre;
        int Peso;

        Animal(String n, int p){
            Nombre = n;
            Peso = p;
        }
        public Animal(int p, String n) {
            this.Peso = p;
            this.Nombre = n;
        }
        public void MD(){ JOptionPane.showMessageDialog(null, "Nombre: " + Nombre +"\n"+ "Peso: " + Peso + " Kilos"); }

        public String getN() {
            return Nombre;
        }

        public void setN(String n) {
            this.Nombre = n;
        }

        public int getP() {
            return Peso;
        }

        public void setP(int p) {
            this.Peso = p;
        }
    }

    static void main() {
    Animal amlEjem= new Animal("Perro viralata", 8);
    Animal amlEjem2 = new Animal(9,"Gato menso");
    Animal amlU = new Animal("",0);

    amlEjem2.MD();
    amlEjem.MD();

    amlU.setN(JOptionPane.showInputDialog(null, "Ingresa un animal: "));
    amlU.setP(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el peso: ")));

    JOptionPane.showMessageDialog(null, "Nombre:" + amlU.getN() + "\n" + "Peso: " + amlU.getP() + " Kilos");
    }
}