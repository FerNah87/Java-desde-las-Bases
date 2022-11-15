import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        /*
        // Variable y palabra reservada
        String saludar = "Hola que tal!!";
        System.out.println(saludar);
        //con la palabra reservada no hace falta especificar que tipo de dato es pero si darle el valor para que sepa que tipo es
        var despedirse = "Hasta luego!!";
        System.out.println(despedirse);

        var documento = 25473647;
        System.out.println(documento);
        */

        /*
        // Concatenacion +
        var usuario = "Fer";
        var saludar = "Hola";
        System.out.println(saludar + " " + usuario);
        var i = 3;
        var j = 5;
        System.out.println(i + j);
        System.out.println(saludar + usuario + "hice esta suma: 3 + 5 = " + (i + j));
        */

        /*
        //caracteres especiales
        var nombre = "Gri";
        var apellido = "Catu";
        System.out.println(nombre + " " + apellido);
        System.out.println("Nueva Linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Retorno de carro: \r" + nombre); //solo imprime el valor
        System.out.println("Comillas simples: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
        System.out.println("saludos");
        System.out.print("adios");
        System.out.println(" nos vemos");
         */

        /*
        //clase scanner para leer info de la consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Da el valor del usuario:");
        var usuario = scanner.nextLine();
        System.out.println("usuario: " + usuario);
        */

        /*
        //Sistemas numericos: tipos primitivos byte, short, int, long
        byte byteVar = 15;
        System.out.println("byteVar = " + byteVar);

        System.out.println("bits tipo bytes: " + Byte.SIZE);  //ver rango maximo tipo byte
        System.out.println("bytes tipo byte: " + Byte.BYTES);
        System.out.println("valor minimo tipo byte: " + Byte.MIN_VALUE); // valor minimos
        System.out.println("valor maximo tipo byte: " + Byte.MAX_VALUE); // valor maximo

        short shortVar = 1000;
        System.out.println("bits tipo short: " + Short.SIZE);  //ver rango maximo tipo byte
        System.out.println("bytes tipo short: " + Short.BYTES);
        System.out.println("valor minimo tipo short: " + Short.MIN_VALUE); // valor minimos
        System.out.println("valor maximo tipo short: " + Short.MAX_VALUE); // valor maximo

        int intVar = 4254;
        System.out.println("bits tipo int: " + Integer.SIZE);  //ver rango maximo tipo byte
        System.out.println("bytes tipo int: " + Integer.BYTES);
        System.out.println("valor minimo tipo int: " + Integer.MIN_VALUE); // valor minimos
        System.out.println("valor maximo tipo int: " + Integer.MAX_VALUE); // valor maximo

        long longVar = 3265945263433264341L;
        System.out.println("longVar = " + longVar);
        System.out.println("bits tipo long: " + Long.SIZE);  //ver rango maximo tipo byte
        System.out.println("bytes tipo long: " + Long.BYTES);
        System.out.println("valor minimo tipo long: " + Long.MIN_VALUE); // valor minimos
        System.out.println("valor maximo tipo long: " + Long.MAX_VALUE); // valor maximo
        */

        /*
        //Sistemas numericos: tipos primitivos decimal, hexadecimal, octal // se puede usar la palabra reservada VAR sobre el INT
        int numeroDecimal = 10;
        System.out.println("numeroDecimal: " + numeroDecimal);

        int numeroOctal = 012;
        System.out.println("numeroOctal: " + numeroOctal);

        int numeroHexadecimal = 0xA;
        System.out.println("numeroHexadecimal: " + numeroHexadecimal);

        int numeroBinario = 0b1010;
        System.out.println("numeroBinario: " + numeroBinario);
        */

        /*
        // Tipos Primitivos: Flotantes // se puede usar la palabra reservada VAR sobre el float
        float floatVar = 1000.10F;
        System.out.println("floatVar: " + floatVar);
        System.out.println("bits tipo float: " + Float.SIZE);
        System.out.println("bytes tipo float: " + Float.BYTES);
        System.out.println("valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("valor maximo tipo float: " + Float.MAX_VALUE);

        double doubleVar = 100.2D;
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("bits tipo double: " + Double.SIZE);
        System.out.println("bytes tipo double: " + Double.BYTES);
        System.out.println("valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("valor maximo tipo double: " + Double.MAX_VALUE);
        */

        /*
        // Tipos Primitivos: Char // se puede usar la palabra reservada VAR sobre el float //valores minimos y maximo varian segun sistema operativo respecto a la tabla Unicode
        System.out.println("bits tipo char: " + Character.SIZE);
        System.out.println("bytes tipo char: " + Character.BYTES);
        System.out.println("valor minimo tipo char: " + Character.MIN_VALUE);
        System.out.println("valor maximo tipo char: " + Character.MAX_VALUE);
        //Los valores corresponden a la tabla UNICODE // la U para decir a java que el valor es unicode
        char charVar = '\u0021';        // se puede usar la palabra reservada VAR
        System.out.println("charVar: " + charVar);
        char charDecimal = 33;          // no es recomendable usar VAR porque pasaria como numero entero
        System.out.println("charDecimal: " + charDecimal);
        char charSimbolo = '!';
        System.out.println("charSimbolo: " + charSimbolo);
        */

        /*
        // Tipos Primitivos: Boolean // No tiene definidio cuantos bits tiene, depende el sistema operativo y la plataforma
        System.out.println("true tipo boolean: " + Boolean.TRUE);
        System.out.println("false tipo boolean: " + Boolean.FALSE);

        boolean booleanVar = true;
        if(booleanVar){
            System.out.println("El valor es verdadero");
        }else {
            System.out.println("El valor es falso");
        }

        System.out.println("");
        var edad = 10;
        var esAdulto = edad >= 18;      //expresion
        System.out.println("Es Adulto: " + esAdulto);
        if (esAdulto){
            System.out.println("Si es adulto");
        }else {
            System.out.println("No es adulto");
        }
        */

        /*
        // Tipos Primitivos: Conversion tipo string a int // se puede usar la palabra reservada VAR sobre el INT
        int edad = Integer.parseInt("20");
        System.out.println("edad: " + edad);

        double valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi: " + valorPi);

        char c = "hola".charAt(2);       //llama un caracter de HOLA
        System.out.println("c = " + c);

        var scanner = new Scanner(System.in);
        edad = Integer.parseInt(scanner.nextLine());
        System.out.println("edad: " + edad);

        char caracter = scanner.nextLine().charAt(0);
        System.out.println("caracter: " + caracter);

        String edadTexto = String.valueOf(25);      //convertimos el entero a tipo string
        System.out.println("edadTexto: " + edadTexto);

        short s = 10;       //casting o conversion de tipos seccion 3.18
        byte b = (byte) s;
        System.out.println("b: " + b);
        */
        /*
        //Operadores en Java
        int a = 3, b = 2;
        int resultado = a + b;
        System.out.println("El resultado es: " + resultado);
        System.out.println("resultado: " + a + b);      //concatenacion de la cadea 3 2 a la cadena resultado
        System.out.println("resultado (aritmetica): " + (a + b));

        resultado = a - b;
        System.out.println("El resultado de la resta: " + resultado);

        resultado = a * b;
        System.out.println("El resultado de la multipli: " + resultado);

        resultado = a / b;
        System.out.println("El resultado de la divi: " + resultado);
        */
        /*
        //Operadores asignacion ( = )

        int a = 3, b = 2;
        int c = a + 5 - b;
        System.out.println(c);
        a += 1;
        System.out.println(a);
        a += 3;
        System.out.println(a);
        */
        /*
        //Operadores Unarios
        int a = 3;
        int b = -a;
        System.out.println("b = " + b);

        boolean c = true;
        boolean d = !c;
        System.out.println("d = " + d);

        //incremento
        //preincremento
        int e = 3;
        int f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        //postincrement
        int g = 5;
        int h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //decremento
        //predecremento
        int i=2;
        int j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //postdecremento
        int k=4;
        int l= k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        */

        /*
        //Operadores de Igualdad y Relacuonales
        int a=3, b=4;

       boolean c = (a == b);
        System.out.println("c = " + c);

        c = (a != b);
        System.out.println("c = " + c);

        String cadena = "hola";
        String cadena2 = "hola";
        System.out.println( cadena.equals(cadena2) );

        boolean d = a <= b;
        System.out.println("d = " + d);

        if( b % 2 == 0){
            System.out.println("numero par");
        }
        else{
            System.out.println("numero impar");
        }

        int edad = 31;
        int adulto = 18;
        if ( edad >= adulto)
            System.out.println("es un adulto");
        else
            System.out.println("es menor de edad");
         */

        /*
        //Operadores Coindicionales
        int a = 15;
        int valorMinimo = 0, valorMaximo=10;
        boolean resultado = a >= valorMinimo && a <= valorMaximo;
        System.out.println("resultado = " + resultado);

        boolean vacaciones = false;
        boolean diaDescanso = true;
        if(vacaciones || diaDescanso)
            System.out.println("Padre puede asistir al juego del hijo");
        else
            System.out.println("Padre ocupado");
         */
        /*
        // Operadores Ternarios
         var resultado = (3 > 2) ? "verdadero" : false;
        System.out.println("resultado = " + resultado);

        var numero = 8;
        var par = (numero % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("par = " + par);
         */
        /*
        // Precedencia de Operadores
                var x = 5;
        var y = 10;
        var z = ++x + y--;//x=6, y=10, z=16
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("\nEjemplo 2 precedencia operadores");
        var resultado = 4 + 5 * 6 / 3;// 4+((5*6)/3) => 4+(30/3) => 4+10 => 14
        System.out.println("resultado = " + resultado);

        resultado = (4 + 5) * 6 / 3;
        System.out.println("resultado = " + resultado);
         */

        /*
        //Sentencias de control if-else
        var condicion = false;

        if (condicion) {
            System.out.println("condicion verdadera");
        } else {
            System.out.println("condicion falsa");
        }

        var numero = 2;
        var numeroTexto = "numero desconocido";

        if( numero == 1 ){
            numeroTexto = "numero uno";
        }
        else if( numero == 2){
            numeroTexto = "numero dos";
        }
        else if( numero == 3){
            numeroTexto = "numero tres";
        }
        else{
            numeroTexto = "valor desconocido";
        }
        System.out.println("numeroTexto = " + numeroTexto);

        ** Ejercicio
                var scanner = new Scanner(System.in);
        System.out.println("Proporciona el mes del año:");
        var mes = scanner.nextInt();//mes del año

        String estacion = null;

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        }
        else if( mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }
        else if( mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }
        else if( mes == 9 || mes == 10 || mes == 11){
            estacion = "Otoño";
        }
        else{
            estacion = "Mes incorrecto";
        }

        System.out.println("estacion:" + estacion + " para el mes: " + mes);

        //Sentencias de control switch
        var numero = 1;
        var numeroTexto = "numero desconocido";

        switch(numero){
            case 1:
                numeroTexto = "numero uno";
                break;
            case 2:
                numeroTexto = "numero dos";
                break;
            case 3:
                numeroTexto = "numero tres";
                break;
            default:
                numeroTexto = "numero desconocido";
      }

        System.out.println("numero texto:" + numeroTexto + " para el numero proporcionado:" + numero );
        ** Ejercicio

        var scanner = new Scanner(System.in);
        System.out.println("Proporcionar el valor del mes");
        var mes = scanner.nextInt();
        String estacion = null;

        switch ( mes ){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes incorrecto";
        }

        System.out.println("estacion: " + estacion + " para el mes:" + mes);
         */

        /*
        //Ciclos - Do While
                var contador = 0;

//        while ( contador < 3) {
//            System.out.println("contador = " + contador);
//            contador++;
//        }

        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador < 3);

        //Ciclos - For
        public static void main(String[] args) {

        for(var i = 0 ; i < 3 ; i++){
            System.out.println("i = " + i);
        }

        //Ciclos - Break-continue
//        for (var i = 0; i < 3; i++) {
//            //Imprimimos solo numeros pares
//            if (i % 2 == 0) {
//                System.out.println("i = " + i);
//                break;
//            }
//        }
            for (var i = 0; i < 3; i++) {
                //Imprimimos solo numeros pares
                if (i % 2 != 0) {
                continue;
                }
                System.out.println("i = " + i);
                }
            }
        }
        */

    }
}