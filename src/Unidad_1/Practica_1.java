package Unidad_1;

public class Practica_1 {
    static void main() {
        /*String V = "Hola, tilin";   // Objeto / Variable de referencia. Variable hecha de un tipo de dato de una clase.
        V.chars(); // Verbo / Acción.
        // Funciones de cadenas (Strings)
        //V.toUpperCase(); // minisculas  a mayusculas.
        String resultado;
        resultado = V.toUpperCase();
        System.out.println(resultado);
        V.charAt(0);*/

        String V = "Hola mundo";
        // Encuentra la posición de el parámetro del indexOF();
        System.out.println(V.indexOf("mundo"));
        // Encuentra la posición del parámetro del indexOF, buscando entre un index inicial y final. Busca un String
        System.out.println(V.indexOf("mundo", 4, 10));
        // Encuentra la posición del parámetro del indexOF, buscando entre un index inicial y final. Busca un Caracter
        System.out.println(V.indexOf("o", 3, 10));
        // Verifica si dentro de la cadena existe el o los caracteres que hay en los parámetros
        System.out.println(V.contains("ola"));

        // Buscar cantidad de letras (especificada)
        char a = 'o';
        int cont= 0;
        int pos = 0;

        do {
            pos = V.indexOf(a, pos + 1);
            if (pos!=-1){
                System.out.println("posicion: " + cont + ": indice: "+ pos);
                cont++;
            }
        }while (pos!=-1);

        if (cont ==0){
            System.out.println("no se encontraron letras " + a);
        }
    }
}
