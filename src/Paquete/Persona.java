//Paso por Referencia
package Paquete;

public class Persona {
    String nombre;

    public String obtenerNombre(){
        return this.nombre;
    }
    public void cambiarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
}