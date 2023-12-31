package org.example;

public class TreballadorPresencial extends Treballador{
    private static int benzina = 50;

    public TreballadorPresencial(String nom, String cognom) {
        super(nom, cognom);
    }

    @Override
    public double calcularSou(double hores){
        return hores * Treballador.getPreuHora() + benzina;
    }
}
