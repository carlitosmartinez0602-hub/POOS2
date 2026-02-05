package Unidad_1;

public class AlumnoPP {
    // Atributos
    int ID;
    String Nombre;
    String Apellido;
    public void MostrarNombre(){
        System.out.println("Hola, soy un alumno y sé decir mi nombre.");
    }

    public AlumnoPP(int ID, String nombre, String apellido) {
        this.ID = ID;
        Nombre = nombre;
        Apellido = apellido;
    }

    public void SaberAprobado (double Nota){
        if (Nota >= 6){
            System.out.println("El Alumno sí aprobó.");
        }else {
            System.out.println("¡El alumno es un pendejo!");
        }
    }
}
