package com.campusdual.exercises.exerciseHerencia;

import java.util.Arrays;
import java.util.List;

import static com.campusdual.utils.Utils.string;

public class Ave extends Animales{

    public String nombre;
    public int altura;
    public static int peso;
    public static int edad;
    public String lugar;
    public String caracteristicas;
    public String nombreCientifico;
    public String sonidoDelAnimal;

    public Ave(String nombre, String altura, int peso, int edad, String lugar, String caracteristicas, String nombreCientifico, String sonidoDelAnimal) {
        this.altura = Integer.parseInt(altura);
        this.nombre = "nombre";
        this.peso = peso;
        this.edad = edad;
        this.lugar = lugar;
        this.caracteristicas= caracteristicas;
        this.nombreCientifico = nombreCientifico;
        this.sonidoDelAnimal = sonidoDelAnimal;
    }

    public static void mostrarNombre() {
        String nombreave1 = string(" nombre: Halcón Milenario ");
        String nombreave2 = string(" nombre: Pollo Calimero ");
    }

    public static void mostrarAltura() {
        String alturaave1 = string(" altura Milenario: 1 ");
        String alturaave2 = string(" altura Calimero: 2 ");
    }

    public static void mostrarPeso() {
        String pesoave1 = string(" peso Milenario: 1 ");
        String pesoave2 = string(" peso Calimero: 3 ");
    }

    public static void mostrarEdad() {
        String edadave1 = string(" edad Milenario: 5 ");
        String edadave2 = string(" edad Calimero: 8 ");
    }

    public static void mostrarCaracteristicas() {
        String caracteristicaave1 = string(" caracteristicas del Halcon: rapido, cazador ");
        String caracteristicasave2 = string(" caracteristicas del pollo: animal de dos patas, tiene plumas ");
    }

    public static void mostrarlugar() {
        String lugarave1 = string(" lugar del Halcon: Monte ");
        String lugarave2 = string(" lugar del pollo: Granja ");
    }

    public static void mostrarNombreCientifico() {
        String nombreave1 = string("nombre cientifico del Halcon Milenario: Falco ");
        String nombreave2 = string("nombre cientifico del pollo Calimero:  Gallus gallus domesticus ");
    }
    public void MamiferoDetails() {
        List<String> stringList = Arrays.asList("Nombre: " + this.nombre + "   Edad: " + edad + "   altura: " + this.altura + "     peso: " +
                peso, "  " + this.lugar + "      lugar: " + this.caracteristicas + "      caracteristicas: " +  this.nombreCientifico+ "     nombreCientifico: " + this.sonidoDelAnimal + "   sonidoDelAnimal ");
    }

    public void graznidoave() {
        System.out.println("ÑIÑIÑI! ");
    }

    public void Piopollo  () {
        System.out.println("PÍO! ");
    }

    public Ave() {
    }


    public static void main(String[] args) {
       Ave ave1 = new Ave();
        System.out.println("  Atributos del objeto ave1");
      ave1.altura = Integer.parseInt("1");
        System.out.println(ave1.altura);
        peso = Integer.parseInt("1");
        System.out.println(peso);
        System.out.println("  Sonido del objeto ave1: ÑIÑIÑI!");
        mostrarNombre();
        mostrarPeso();
        mostrarEdad();
        mostrarAltura();
        mostrarlugar();
        mostrarCaracteristicas();
        mostrarNombreCientifico();
        mostrarSonido();
        edad = Integer.parseInt("5");


        System.out.println("  Atributos del objeto ave2");
        Ave ave2 = new Ave();
        System.out.println(ave2.nombre);
        ave2.altura = Integer.parseInt("5");
        System.out.println(ave2.altura);
        System.out.println(peso);
        peso = Integer.parseInt("3");
        mostrarNombre();
        mostrarAltura();
        mostrarEdad();
        mostrarPeso();
        mostrarlugar();
        mostrarCaracteristicas();
        mostrarNombreCientifico();
        System.out.println("  Sonido del objeto ave2: PÍO!");
        mostrarSonido();
        edad = Integer.parseInt("8");
    }

    private static void mostrarSonido() {
    }
}
