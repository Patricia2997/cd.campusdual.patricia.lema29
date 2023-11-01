package com.campusdual.exercises;

import com.campusdual.utils.Utils;

import static com.campusdual.utils.Utils.*;

public class Cat {

    public String name;
    public String breed;
    public int age;
    public String sex;
    public String hair;
    public String colour;
    boolean castrado;
    private String eyeColour = "green";

    public Cat(String name, String sex, String breed, String hair, String colour, boolean b) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.hair = hair;
        this.colour = colour;
        this.castrado = castrado;
        this.eyeColour = eyeColour;
        this.sex = sex;
    }

    public static String changeColour() {
        String colour = string("Introduce el color del pelo: ");
        return colour;
    }

    public void changeEyeColour() {
        this.eyeColour = string("Introduce el color de ojos: ");
    }

    public static int changeAge() {
        int age = Utils.integer("Introduce la edad del gato: ");
        return age;
    }

    public int obtenerAge() {
        return age;
    }

    public void chageCastrado() {
        this.castrado = true;
    }

    public void isCastrado() {
        if (this.castrado == true) {
            System.out.println("El gato está castrado");
        } else {
            System.out.println("El gato no está castrado");
        }
    }

    public void catDetails() {
        System.out.println("Nombre: " + this.name + "   Edad: " + age + "   Sexo: " + this.sex + "     Raza: " +
                this.breed);
        System.out.println("Color de los ojos: " + this.eyeColour + "     Tipo de pelo: " + this.hair);
        System.out.println("Color del pelo: " + colour);
        isCastrado();
        System.out.println("  ");
    }


    public static void main(String[] args) {
        System.out.println("== Creo nuevo gato ==");
        Cat miCatLeo = new Cat("Leo", "Macho", "Siames", "corto", "marron", true);
        System.out.println("Creo nuevo gato");
        Cat miCatNube = new Cat("Nube", "Hembra", "esfinge", "corto", "negro", false);
        System.out.println("Creo nuevo gato");
        Cat miCatRabi = new Cat("Rabi", "Hembra", "Persa", "corto", "blanco", true);
        System.out.println("== Muestro los detalles de los gatos ==");
        MostrarDetallesCat();
        miCatLeo.catDetails();
        miCatNube.catDetails();
        miCatRabi.catDetails();
    }
    private static void MostrarDetallesCat() {
    }

}









