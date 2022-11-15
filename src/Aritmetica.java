// Seccion 9 Metodos en Java
// Constructor nos permite inicializar los valores de la clase y reservar un espacio en memoria para crear un objeto de nuestra clase

public class Aritmetica {
    /*// Atributos de la clase
    int a;
    int b;
    public Aritmetica(){                                    //Contructor vacio: solo llama cuando se crea el objeto
//        a = 5;
//        b = 3;
        System.out.println("Ejecutando un constructor vacio");
    }

    public Aritmetica(int arg1, int arg2){
        a = arg1;
        b = arg2;
        System.out.println("Ejecutando constructor con 2 argumentos");
    }

    public int sumar(){
        int resultado = a + b;      //se utilizan los atributos de las clases
        return resultado;
    }*/

    //Seccion 11. 52
    int a;
    int b;
    public Aritmetica(){
        System.out.println("Ejecutando constructor vacion");
    }
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con 2 argumentos");
    }
    public int sumar(){
        return this.a + this.b;
    }
    public int resta(){
        return this.a - this.b;
    }
    public  int multiplicar(){
        return this.a * this.b;
    }
    public int division(){
        return this.a / this.b;
    }
}
