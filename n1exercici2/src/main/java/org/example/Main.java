package org.example;

public class Main {
    @SuppressWarnings(value = "deprecation")
    public static void main(String[] args) {
        System.out.println("Mateixes hores treballades (268):");
        Treballador treballador = new Treballador("Joan", "Caballero");
        System.out.println(treballador.calcularSou(268) + " Sou base.");
        TreballadorPresencial tP = new TreballadorPresencial("Oscar", "Osbiju");
        System.out.println(tP.calcularSou(268) + " Sou presencial.");
        TreballadorOnline tO = new TreballadorOnline("Paulo", "Shalaka");
        System.out.println(tO.calcularSou(268) + " Sou online.");

        System.out.println(tO.cognomNom());
        System.out.println(tP.cognomNomCognom());
    }
}