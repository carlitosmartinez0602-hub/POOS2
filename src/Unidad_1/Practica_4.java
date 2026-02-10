package Unidad_1;

import java.util.Arrays;

public class Practica_4 {
    static void main() {
        //converir cada inicial de cada palabra ne mayusculas

        String cadena = "está erguido cual estatua romana y así permanerá hasta que la muerte " +
                "lo convierta en mármól.", to = " ";
        //Separación de las palabras
        String vector[] = cadena.split(" ");
        //bucle para convertir letra inicial a mayusculas
        for (int i = 0; i < vector.length; i++) {
            //Convierte la inicial a mayusculas
            System.out.println(vector[i].substring(0,1).toUpperCase());
            //hace que la primera letra sea mayuscula y el resto se quede igual= vector[i].subString(0,1 ) primera letra mayuscula y vector[i].subString (1) deja el resto igual
            String PC = vector[i].substring(0,1).toUpperCase() + vector[i].substring(1);
            //Agrega un epsacio
            to += PC + " ";
        }
        System.out.println(to);
        System.out.println(Arrays.toString(vector));
    }
}
