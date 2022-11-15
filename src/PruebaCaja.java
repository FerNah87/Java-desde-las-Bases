import Paquete.Caja;

public class PruebaCaja {
    public static void main(String[] args) {
        int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProf = 6;

        Caja caja1 = new Caja();
        int resultado = caja1.calcVolumen(medidaAncho, medidaAlto, medidaProf);
        System.out.println("resultado de caja 1 es: " + resultado);

        Caja caja2 = new Caja(2, 4, 6);
        System.out.println("resultado de caja 2 es: " + caja2.calcVolumen());
    }
}
