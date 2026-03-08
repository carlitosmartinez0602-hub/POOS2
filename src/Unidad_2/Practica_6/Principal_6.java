package Unidad_2.Practica_6;

import javax.swing.*;

public class Principal_6 {
    static void main(String[] args) {
        Practica_6_1.libro libro = new Practica_6_1.libro();

        libro.setISBN(JOptionPane.showInputDialog("Ingresa el ISBN: "));
        libro.setTitulo(JOptionPane.showInputDialog("Título: "));
        libro.setAutor(JOptionPane.showInputDialog("Autor: "));
        libro.setnPag(Integer.parseInt(JOptionPane.showInputDialog("Número de páginas: ")));
        JOptionPane.showMessageDialog(null, "Valores: " + libro.toString());

        Practica_6_1.libro libro2 =  new Practica_6_1.libro();
        libro2.setISBN(JOptionPane.showInputDialog("Ingresa el ISBN: "));
        libro2.setTitulo(JOptionPane.showInputDialog("Título: "));
        libro2.setAutor(JOptionPane.showInputDialog("Autor: "));
        libro2.setnPag(Integer.parseInt(JOptionPane.showInputDialog("Número de páginas: ")));
        JOptionPane.showMessageDialog(null, "Valores: " + libro2.toString());


        JOptionPane.showMessageDialog(null,"FN: " + libro.toString() +" \n "+ libro2.toString());
        if (libro.getnPag() > libro2.getnPag()) {
            JOptionPane.showMessageDialog(null, "El libro " + libro.getTitulo() +
                    " tiene más paginas que el libro " + libro2.getTitulo());
        }else if(libro2.getnPag() > libro.getnPag()){
            JOptionPane.showMessageDialog(null, "El libro " + libro2.getTitulo() +
                    " tiene más paginas que el libro " + libro.getTitulo());
        }else{
            JOptionPane.showMessageDialog(null, "Los libros " + libro + " y " + libro2 +
                    " tienen la misma cantidad de páginas");
        }
    }
}
