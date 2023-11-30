package org.example;

public class Treballador {
    private String nom, cognom;
    private static final double preuHora = 11.8;

    public Treballador(String nom, String cognom){
        this.nom = nom;
        this.cognom = cognom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public static double getPreuHora() {
        return preuHora;
    }

    public double calcularSou(double hores){
        return hores*preuHora;
    }
}
