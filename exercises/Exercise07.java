package com.campusdual.exercises;

import com.campusdual.utils.Utils;

import java.util.Scanner;

public class Exercise07 {
    // Mostrar los primeros 15 números naturales
    // Sumar los primeros 100 números naturales
    // Pedir al usuario su nombre y mostrar por pantalla un mensaje de bienvenida con el
    // Pedir al usuario un numero mayor que 5 y mostrarlo por pantalla
    public static void printNNumbers(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
    }

    public static int sumNumbers(int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        printNNumbers(3);
        printNNumbers(22);
        printNNumbers(15);
        printNNumbers(13);

        System.out.println(sumNumbers(100));
        System.out.println(sumNumbers(10));
        System.out.println(sumNumbers(5));

        mostrarSaludo();
        pedirNumero();
    }

    public static void mostrarSaludo() {
        Scanner scan = new Scanner(System.in);
        String nombreUsuario;
        System.out.println("Introduce tu nombre");
        nombreUsuario = scan.next();
        System.out.println("Hola " + nombreUsuario + "! ¿Como estas?");
    }


    public static void pedirNumero() {
        Scanner scan = new Scanner(System.in);
        int numeroParaMostrar;
        do {
            System.out.println("Introduce un numero mayor que 5");
            numeroParaMostrar = scan.nextInt();
        } while (numeroParaMostrar < 5);
        System.out.println("El numero que has escrito es: " + numeroParaMostrar);
    }


    public static void mostrarSaludoConUtils() {
        String nombreUsuario = Utils.string("Introduce tu nombre: ");
        System.out.println("Hola " + nombreUsuario + "! ¿Como estas?");
    }

    public static void pedirNumeroConUtils() {
        int numeroParaMostrar;
        do {
            numeroParaMostrar = Utils.integer("Introduce un número mayor que 5: ");
        } while (numeroParaMostrar < 5);
        System.out.println("El número que has escrito es: " + numeroParaMostrar);
    }

}