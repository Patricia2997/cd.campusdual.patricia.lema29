package com.campusdual.exercises.exerciseHerencia;

import java.util.Arrays;
import java.util.List;

import static com.campusdual.utils.Utils.string;

public class Pez extends Animales{
    public String nombre;
    public int altura;
    public static int peso;
    public static int edad;
    public String lugar;
    public String caracteristicas;
    public String nombreCientifico;
    public String sonidoDelAnimal;
    public Pez(String nombre, String altura, int peso, int edad, String lugar, String caracteristicas, String nombreCientifico, String sonidoDelAnimal) {
        this.altura = Integer.parseInt(altura);
        this.nombre = "nombre";
        this.peso = peso;
        this.edad = edad;
        this.lugar = lugar;
        this.nombreCientifico = nombreCientifico;
        this.sonidoDelAnimal = sonidoDelAnimal;
    }

    public static void mostrarNombre() {
        String nombrpez1 = string(" nombre: Delfin Flipper");
        String nombrepez2 = string(" nombre: Orca Willy ");
    }

    public static void mostrarAltura() {
        String alturapez1 = string(" altura Flipper: 30 ");
        String alturapez2 = string(" altura Willy: 50 ");
    }

    public static void mostrarPeso() {
        String pesopez1 = string(" peso Flipper: 200T ");
        String pesopez2 = string(" peso Willy: 600T ");
    }

    public static void mostrarEdad() {
        String edadpez1 = string(" edad Flipper: 3 ");
        String edadpez2 = string(" edad Willy: 2 ");
    }

    public static void mostrarCaracteristicas() {
        String caracteristicaspez1 = string(" caracteristicas del delfin: posee dientes, carnívoro");
        String caracteristicaspez2 = string(" caracteristicas de la orca: es grande, asesino");
    }

    public static void mostrarlugar() {
        String lugarpez1 = string(" lugar del delfin: Mar ");
        String lugarpez2 = string(" lugar de la orca: Mar ");
    }

    public static void mostrarNombreCientifico() {
        String nombrepez1 = string("nombre cientifico del delfin Flipper: Delphiniade ");
        String nombrepez2 = string("nombre cientifico de la orca Willy: Orcinus Orca");
    }

    public void MamiferoDetails() {
        List<String> stringList = Arrays.asList("Nombre: " + this.nombre + "   Edad: " + edad + "   altura: " + this.altura + "     peso: " +
                peso, "  " + this.lugar + "      lugar: " + this.caracteristicas + "      caracteristicas: " +  this.nombreCientifico+ "     nombreCientifico: " + this.sonidoDelAnimal + "   sonidoDelAnimal ");
    }

    public void silbidodelfin() {System.out.println("iiiiiiiii! ");
    }
    public void sonidoorca() {System.out.println("Piiiiii! ");
    }

    public Pez() {
    }

    public static void main(String[] args) {
        Pez pez1 = new Pez();
        System.out.println("  Atributos del objeto pez1");
        pez1.altura = Integer.parseInt("1");
        System.out.println(pez1.altura);
        peso = Integer.parseInt("2");
        System.out.println(peso);
        mostrarNombre();
        mostrarPeso();
        mostrarEdad();
        mostrarAltura();
        mostrarlugar();
        mostrarCaracteristicas();
        mostrarNombreCientifico();
        System.out.println("  Sonido del objeto pez1: iiiiiiii!");
        mostrarSonido();
        edad = Integer.parseInt("3");

        System.out.println("  Atributos del objeto pez2");
        Pez pez2 = new Pez();
        System.out.println(pez2.nombre);
        pez2.altura = Integer.parseInt("5");
        System.out.println(pez2.altura);
        System.out.println(peso);
        peso = Integer.parseInt("6");
        mostrarNombre();
        mostrarAltura();
        mostrarEdad();
        mostrarPeso();
        mostrarlugar();
        mostrarCaracteristicas();
        mostrarNombreCientifico();
        System.out.println("  Sonido del objeto pez2: PIIIIII!");
        mostrarSonido();
        edad = Integer.parseInt("2");
    }
    private static void mostrarSonido() {
    }
}






