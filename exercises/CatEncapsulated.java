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
    private String getCastrado;

    public CatEncapsulated(String name, String breed, String sex, int age, String hair, String colour,
                           boolean castrado) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.hair = hair;
        this.colour = colour;
        this.castrado = true;
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

    public static void setAge(int age) {
        if(age > 0) {
            System.out.println("La edad " + age + " es un número positivo.");
        } else {
            System.out.println("La edad " + age + " es un número negativo.");
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
        System.out.println("El color del cat es: " + getColour());

    }
    public String Castrado() {
        if (this.castrado) {
            return "castrado";
        } else {
            return "no castrado";
        }
    }

    public void setCastrado() {
        this.castrado = true;
        System.out.println("El gato " + this.name + " ha sido castrado");
        System.out.println("El gato ha sido castrado");
    }

    public String getEyeColour() {
        return eyeColour;
    }
    public void setEyeColour() {
        System.out.println("El color del cat es: " + getEyeColour());
    }
    public void catEncapsulatedDetails() {
        System.out.println("Name: " + this.getName() + "   Age: " + this.getAge() +    " Years" + "   Sex:  " + this.getSex() + "    " +  "Breed: "  + this.getBreed());
        System.out.println(  "Eye colour: " + this.getEyeColour() + "   " +  " Hair type:   " + this.getHair() +   "Hair colour:   " + this.getColour() + "Cat castrated:   " + this.Castrado());
    }


    public static void main(String[] args) {
        CatEncapsulated gatoKira = new CatEncapsulated("Kira", "siames", "Hembra", 4, "pelo corto",
                "blanco", false);
        CatEncapsulated gatoKyle = new CatEncapsulated("Kyle", "persa", "Hembra", 3, "pelo corto",
                "gris", false);
        CatEncapsulated gatoTeo = new CatEncapsulated("Teo", "esfinge", "Macho", 1, "largo", "marron",
                false);

        System.out.println("Muestra el nombre del minino");
        System.out.println("Muestra la raza del minino");
        System.out.println("Muestra el sexo del minino");
        System.out.println("Muestra la edad del minino");
        System.out.println("Muestra el corte del pelo del minino");
        System.out.println("Muestra el color del pelaje del minino");
        System.out.println("Muestra si está castrado el minino");
        System.out.println("   ");
        gatoKira.catEncapsulatedDetails();
        gatoKyle.catEncapsulatedDetails();
        gatoTeo.catEncapsulatedDetails();

    }
}



