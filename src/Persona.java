public class Persona {
    //Atributos de nuestra clase
    String nombre;
    String apellido;

    String apodo;

    //Metodo de la clase
    //Lo usaran los objetos de esta clase
    public void desplegarNombres( ){        //reservada void porque no va a regresar info
        System.out.println("nombre:" + nombre);
        System.out.println("apellido:" + apellido);
        System.out.println("apodo: " + apodo);
    }
}
