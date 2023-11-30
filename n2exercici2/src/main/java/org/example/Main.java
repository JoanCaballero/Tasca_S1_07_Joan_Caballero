package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    @Serialitzar(directory = "C:\\Users\\formacio\\Desktop\\JC\\Tasca_S1_07_Joan_Caballero")
    public static void main(String[] args) {
        serialitzarObjecte(new Persona("Joan", 24),"");
        System.out.println("Hello world!");


    }

    public static void serialitzarObjecte(Object persona, String arxiu){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arxiu))) {
            oos.writeObject(persona);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @interface Serialitzar{
        String directory() default "";
    }
}