public class PersonaPrueba {
    public static void main(String[] args) {

        //Creacion de un objeto de tipo Persona y define la variable de tipo Persona
        Persona persona1;

        //Instanciando (creando) un objeto de la clase Persona
        persona1 = new Persona();

        //Accedemos al objeto persona, y llamamos al metodo desplegarNombres
        persona1.desplegarNombres();

        //Modificamos los valores de los atributos del objeto Persona
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.apodo = "Juanchito";

        //volvemos a imprimir los valores
        System.out.println("");
        persona1.desplegarNombres();

        //Creacion de un segundo objeto de tipo Persona
        Persona persona2 = new Persona();
        persona2.nombre = "Karla";
        persona2.apellido = "Gomez";
        persona2.apodo = "cachita";

        System.out.println("");
        persona2.desplegarNombres();
        // Se crearon 2 objetos (new) y 2 variables (persona1/2)
    }
}
