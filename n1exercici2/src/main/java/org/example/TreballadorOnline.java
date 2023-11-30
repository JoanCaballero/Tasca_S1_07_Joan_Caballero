package org.example;

public class TreballadorOnline extends Treballador{

    private static final int INTERNET = 105;

    public TreballadorOnline(String nom, String cognom) {
        super(nom, cognom);
    }

    @Override
    public double calcularSou(double hores){
        return hores * Treballador.getPreuHora() + INTERNET;
    }

    @Deprecated
    public String cognomNom(){
        return (this.getCognom() + ", " + this.getNom());
    }
}
