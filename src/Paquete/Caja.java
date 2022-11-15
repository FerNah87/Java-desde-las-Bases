package Paquete;

public class Caja {
    private int ancho;
    private int alto;
    private int profundo;

    public Caja(){
    }

    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    public int calcVolumen(){
        return ancho * alto * profundo;
    }
    public int calcVolumen(int ancho, int alto, int profundo){
        return ancho * alto * profundo;
    }
}
