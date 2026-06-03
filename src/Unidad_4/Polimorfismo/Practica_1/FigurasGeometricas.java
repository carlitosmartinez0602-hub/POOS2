package Unidad_4.Polimorfismo.Practica_1;

import javax.swing.*;
import java.util.ArrayList;

public class FigurasGeometricas {
    static void main(String[] args) {
        ArrayList<Poligono> listaPoligonos = new ArrayList<>();

        Poligono pol = new Triangulo();
        Triangulo tri = new Triangulo();
        Cuadrilatero cua = new Cuadrilatero();
        Perro perro = new Perro();

        pol = tri;
        JOptionPane.showMessageDialog(null, pol);
        pol = cua;
        JOptionPane.showMessageDialog(null,pol);

        Object o = new Poligono();
        o = tri;
        JOptionPane.showMessageDialog(null, o);
        o= cua;
        JOptionPane.showMessageDialog(null, o);
        o = perro;
        JOptionPane.showMessageDialog(null, o);
    }
}
