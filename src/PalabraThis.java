//This como referencia Seccion 15.61
/*public static void main(String[] args) {
        Persona p = new Persona("Juan");
    }
}
class Persona {
    String nombre;  //atributo de la calse
    Persona(String nombre){         //constructor
        this.nombre = nombre;       //this es el objeto Persona (actual)
    }
    //Imprimimos el objeto persona
    Imprimir i = new Imprimir();
    i.imprimir(this);       //this es el objeto Persona(actual)
}
class Imprimir{
    public void imprimir(Object o){
        System.out.println("Imprimir parametros: " + o);        //el parametro es el objeto persona
        System.out.println("Imprimir objeto actual (this): " + this);       //this es el objeto imprimir actual
    }
*/
public class PalabraThis {
    public static void main(String[] args) {

    }
}

class Persona{
    String nombre;
    Persona(String nombre){
        this.nombre = nombre;       //apunta a un objeto del tipo persona
    }
}

class Imprimir{
    public void imprimir(Persona p){
        System.out.println("Impresion argumento persona: " + p);        //imprime el valor objeto persona
        System.out.println("Impresion objeto actual (this): " + this);      //apunta a un objeto de tipo imprimir
    }
}