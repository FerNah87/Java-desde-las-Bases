//Seccion 14.59
public class PalabraReturnTiposPrimitivos {
    public static void main(String[] args) {
        sumarSinRetornarValores(3, 6);
        int resultado = sumarRetornandoValor(4, 2);
        System.out.println("El resultado sumar retornando valor: " + resultado);
    }
    private static void sumarSinRetornarValores(int a, int b){
        System.out.println("El resultado sumar sin retornar valor: " + (a + b));
        return; //es opcional si no esta lo hace automaticamente
    }
    private static int sumarRetornandoValor(int a, int b){
        if (a == 0 && b == 0){
            System.out.println("Debe proporcionar valores distintos de cero");
            return 0;
        }
        System.out.println("Los valores proporcionado son distintos de cero");
        return (a + b);
    }
}
