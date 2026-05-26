package Unidad_4.Practica_2;

public class Perro extends Animal {
    @Override
    public void mover() {
        Animal.dInf("Se mueve en 4 patas");
    }
    public void dormirse(){
        Animal.dInf("El perro se duerme");
    }
}
