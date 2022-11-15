// Seccion 9 Metodos en Java
public class PruebaAritmetica {
    public static void main(String[] args) {
       /* // Creamos un objeto de tipo Aritmetica
        Aritmetica  aritmetica = new Aritmetica();          //Llamamos al constructor vacio "Ejecutando..."
        aritmetica.a = 10;
        aritmetica.b = 3;

        int resultado = aritmetica.sumar();
        //tenemos la llamada al metodo sumar y el valor del resultado
        System.out.println("resultado: " + resultado);

        //Creacion de segundo objeto
        Aritmetica aritmetica2 = new Aritmetica(4,2);
        System.out.println("resultado2 es : " + aritmetica2.sumar());*/

        //Seccion 11. 52
        //variable local porque se pueden utilizar dentro del metodo donde se definieron
        int operandoA = 6;
        int operandoB = 2;
        //Creamos un objeto de la clase Aritmetica enviando argumentos
        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);
        //imprimir los valores de los operando
        System.out.println("operando A: " + operandoA);
        System.out.println("operando B: " + operandoB);

        //imprimimos el resultado de la suma
        System.out.println("\nResultado suma: " + objeto1.sumar());
        System.out.println("\nResultado resta: " + objeto1.resta());
        System.out.println("\nResultado multiplicar: " + objeto1.multiplicar());
        System.out.println("\nResultado division: " + objeto1.division());
    }
}
