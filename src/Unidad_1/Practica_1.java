package Unidad_1;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Practica_1 {
    static void main() {
        String V = "Está erguido, ¡cual estatua romana! y así permanerá hasta" +
                "que la muerte lo convierta en mármol";
        // Encuentra la posición de el parámetro del indexOF();
        System.out.println(V.indexOf("estatua"));
        // Encuentra la posición del parámetro del indexOF, buscando entre un index inicial y final. Busca un String
        System.out.println(V.indexOf("así", 4, 50));
        // Encuentra la posición del parámetro del indexOF, buscando entre un index inicial y final. Busca un Caracter
        System.out.println(V.indexOf("o", 3, 23));
        // Verifica si dentro de la cadena existe el o los caracteres que hay en los parámetros
        System.out.println(V.contains("marmol"));
        // Devuelve el carácter en tipo char con el índice especificado
        System.out.println(V.charAt(5));
        // Hace que el texto de la cadena se vuelva mayuscula
        System.out.println(V.toUpperCase(Locale.ROOT));
        // Hace que el texto de la cadena sean todos minúsculas
        System.out.println(V.toLowerCase(Locale.ROOT));
        // Devuelve el resultado en forma de codigo ASCII (en este caso Alt + 115 = s)
        System.out.println(V.codePointAt(1));
        // Devuelve la longitud o tamaño de la cadena
        System.out.println(V.length());
    }
}
