package com.campusdual.exercises.exerciseHerencia;

import java.util.Arrays;
import java.util.List;

import static com.campusdual.utils.Utils.string;

public class Mamifero extends Animales{
    public String nombre;
    public int altura;
    public static int peso;
    public static int edad;
    public String lugar;
    public String caracteristicas;
    public String nombreCientifico;
    public String sonidoDelAnimal;



    public Mamifero(String nombre, String altura, int peso, int edad, String lugar, String caracteristicas, String nombreCientifico, String sonidoDelAnimal) {
        this.altura = Integer.parseInt(altura);
        this.nombre = nombre;
        Mamifero.peso = peso;
        Mamifero.edad = edad;
        this.lugar = lugar;
        this.caracteristicas = caracteristicas;
        this.nombreCientifico = nombreCientifico;
        this.sonidoDelAnimal = sonidoDelAnimal;
    }

    public static void mostrarNombre() {
        String nombremamifero1 = string("nombre: perro Balto ");
        String nombreMamifero2 = string("nombre: caballo Spirit ");
    }

    public static void mostrarAltura() {
        String alturamamifero1 = string(" altura Balto: 1 ");
        String alturaMamifero2 = string(" altura Spirit: 5 ");
    }

    public static void mostrarPeso() {
        String pesomamifero1 = string(" peso Balto: 1 ");
        String pesoMamifero2 = string(" peso Spirit: 5 ");
    }

    public static void mostrarCaracteristicas() {
        String caracteristicasmamifero1 = string(" caracteristicas del perro: cuadrúpedo, tiene rabo ");
        String caracteristicasMamifero2 = string(" caracteristicas del caballo: fuerte, herbivoro ");
    }

    public static void mostrarlugar() {
        String lugarmamifero1 = string(" lugar del perro: Coristanco ");
        String lugarMamifero2 = string(" lugar del caballo: Monte dos Moinantes ");
    }

    public static void mostrarEdad() {
        String edadmamifero1 = string(" edad Balto: 5 ");
        String edadMamifero2 = string(" edad Spirit: 8 ");
    }


    public void MamiferoDetails() {
        List<String> stringList = Arrays.asList("Nombre: " + this.nombre + "   Edad: " + edad + "   altura: " + this.altura + "     peso: " +
                peso, "  " + this.lugar + "      lugar: " + this.caracteristicas + "      caracteristicas: " +  this.nombreCientifico+ "     nombreCientifico: " + this.sonidoDelAnimal + "   sonidoDelAnimal " );
    }
    public void ladrarperro() {
        System.out.println("Guau! Guau!");
    }
    public void bufidocaballo () {System.out.println("HÍ! HÍ!");}
    public static void mostrarNombreCientifico() {
        String nombremamifero1 = string("nombre cientifico del perro Balto: Canis lupus familiaris ");
        String nombreMamifero2 = string("nombre cientifico del caballo Spirit: Equs Ferus Caballus ");
    }

    public Mamifero() {
    }

    public static void main(String[] args) {
        Mamifero mamifero1 = new Mamifero();
        System.out.println("  Atributos del objeto mamifero1");
        System.out.println(mamifero1.altura);
        peso = Integer.parseInt("7");
        System.out.println(peso);
        peso = Integer.parseInt("10");
        mostrarNombre();
        mostrarAltura();
        mostrarEdad();
        mostrarPeso();
        mostrarlugar();
        mostrarCaracteristicas();
        mostrarNombreCientifico();
        System.out.println("  Sonido del objeto mamifero1: GUAU! GUAU!");
        mostrarSonido();
        edad = Integer.parseInt("5");


        System.out.println("  Atributos del objeto mamifero2");
        Mamifero mamifero2 = new Mamifero();
        System.out.println(mamifero2.nombre);
        mamifero2.altura = Integer.parseInt("5");
        System.out.println(mamifero2.altura);
        System.out.println(peso);
        peso = Integer.parseInt("40");
        mostrarNombre();
        mostrarAltura();
        mostrarEdad();
        mostrarPeso();
        mostrarlugar();
        System.out.println("  Sonido del objeto mamifero2: HI! HI! ");
        mostrarSonido();
        mostrarCaracteristicas();
        mostrarNombreCientifico();
        edad = Integer.parseInt("8");
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {

        this.caracteristicas = caracteristicas;
    }


    private static void mostrarSonido() {
    }
}
