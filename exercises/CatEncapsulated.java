package com.campusdual.exercises;

import com.campusdual.utils.Utils;

public class CatEncapsulated {
    private String name;
    private String breed;
    private int age;
    private String sex;
    private String hair;
    private String colour;
    private boolean castrado;
    private String eyeColour = "green";

    public CatEncapsulated(String name, String breed, String sex, int age, String hair, String colour,
                           boolean castrated) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.hair = hair;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public void setAge() {
        int age = Utils.integer("6");

        if (age > 0) {
            this.age = age;
        } else {
            while (age < 0) {
                System.out.println("La edad introducida debe ser un número positivo.");
                age = Utils.integer("Introduzca la edad del gato: ");
            }
            this.age = age;
        }
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getColour() {
        return colour;
    }

    public void setColour() {
        String colour = Utils.string("Introduzca el color de pelo de  " + this.name + " :");
        this.colour = colour;
        System.out.println("El color de pelo de " + this.name + " ha sido cambiado a " + this.colour);
    }

    public String isCastrado() {
        if (this.castrado) {
            return "no castrado";
        } else {
            return "castrado";
        }
    }

    public void setCastrado() {
        this.castrado = true;
        System.out.println("El gato " + this.name + "ha sido castrado");
    }

    public String getEyeColour() {
        return eyeColour;
    }
    public void setEyeColour() {
        String eyeColour = Utils.string("Introduzca el color de ojos de " + this.name + " :");
        this.eyeColour = eyeColour;
        System.out.println("El color de ojos de " + this.name + " ha sido cambiado a " + this.eyeColour);
    }

    public void catEncapsulatedDetails() {
        System.out.println("Nombre: " + this.name + "   Edad: " + this.age + " Años" + "   Sexo: " + this.sex + "     "
                + "Raza: " + this.breed);
        System.out.println("Color de los ojos: " + this.eyeColour + "     Tipo de pelo: " + this.hair);
        System.out.println("Color del pelo: " + this.colour + "     Está: " + isCastrado());
        System.out.println("  ");
    }
    public static void main(String[] args) {
        CatEncapsulated gatoKira = new CatEncapsulated("Kira", "siames", "Hembra", 4, "pelo corto",
                "blanco", false);
        CatEncapsulated gatoKyle = new CatEncapsulated("Kyle", "persa", "Hembra", 3, "pelo corto",
                "gris", false);
        CatEncapsulated gatoTeo = new CatEncapsulated("Teo", "esfinge", "Macho", 1, "largo", "marron",
                false);

        gatoKira.setCastrado();
        gatoKira.setCastrado();
        gatoKira.setColour();
        gatoKyle.setColour();
        gatoTeo.setEyeColour();
        gatoTeo.setAge();
        System.out.println("   ");
        gatoKira.catEncapsulatedDetails();
        gatoKyle.catEncapsulatedDetails();
        gatoTeo.catEncapsulatedDetails();

    }
}


