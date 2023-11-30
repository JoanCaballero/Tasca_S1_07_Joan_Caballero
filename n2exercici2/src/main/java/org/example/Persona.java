package org.example;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nom;
    private int edat;

    public Persona(String nom, int edat){
        this.nom = nom;
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }
}
