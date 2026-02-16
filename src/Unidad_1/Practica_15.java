package Unidad_1;

import javax.swing.*;
import java.util.ArrayList;

public class Practica_15 {
    static void main() {
        ArrayList<Integer> num = new ArrayList<>();

        while(true){
            String p = JOptionPane.showInputDialog(null, "Escribe un número (negativo para terminar): ");
            int np = Integer.parseInt(p);
            if(np < 0){
                break;
            }
            num.add(np);
        }

        int mayor = num.get(0);
        int menor = num.get(0);

        for(int i = 1; i < num.size(); i++) {
            if(num.get(i) > mayor) {
                mayor = num.get(i);
            }
            if(num.get(i) < menor) {
                menor = num.get(i);
            }
        }

        JOptionPane.showMessageDialog(null, "Números guardados: " + num + "\nMayor: " + mayor + "\nMenor: " + menor);
    }
}