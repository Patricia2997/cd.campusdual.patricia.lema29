package com.campusdual.exercises;

public class Exercise04 {

    // Sumar los 5 primeros números naturales
    // Sumar los 20 primeros números pares
    // Sumar el factorial de un número que queramos
    public static void main(String[] args) {
        System.out.println("El resultado de sumar los 5 primeros números es: ");
        System.out.println(sumarPrimeros());
        System.out.print("El resultado de sumar los 20 primeros números pares es: ");
        System.out.println(sumarPares());

    }
    public static int sumarPrimeros() {
        int suma = 1 + 2 + 3 + 4 + 5;
        return suma;

    }

    public static int sumarPares() {
        int suma = 2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40;
        return suma;
    }
    public static int factorial() {
        int fact = 7 * 6 * 5 * 4 * 3 * 2 * 1;
        return fact;
    }

}


