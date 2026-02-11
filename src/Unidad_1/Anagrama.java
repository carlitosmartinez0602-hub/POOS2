package Unidad_1;

import javax.swing.*;
import java.util.Arrays;

public class Anagrama {
    static void main() {
        //Escribe una función que reciba dos palabras (String) y retorne
        // * verdadero o falso según sean o no anagramas.
        // * - Un Anagrama consiste en formar una palabra reordenando TODAS
        // *   las letras de otra palabra inicial.
        // * - NO hace falta comprobar que ambas palabras existan.
        String t1, t2;
        System.out.println("\n|-----Anagrama-----|\n");
        t1 = JOptionPane.showInputDialog(null, "Escribe la primera palabra");
        t2 = JOptionPane.showInputDialog(null,"Escribe la segunda palabra");
        String Com[] = t1.split( "");
        String Com2[] = t2.split("");
        Arrays.sort(Com);
        Arrays.sort(Com2);
        if (Arrays.equals(Com, Com2)) {
            JOptionPane.showMessageDialog( null, "son anagramas ");
        }else{
            JOptionPane.showMessageDialog(null, "No son anagramas");
        }
    }
}
