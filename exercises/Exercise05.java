package com.campusdual.exercises;

public class Exercise05 {
    // Comprobar que un número es positivo o negativo. Mayor o menor que 0
    // Comprobar si un número es múltiplo de otro. Resto de la división. Resto de la división en 0
    // Comprobar si un número es menor a otro. Mayor que el otro

    public static void main(String[] args) {
        System.out.print("Comprobar si el numero es positivo o negativo: ");
        esPositivo(4);

        System.out.println("Comprobar si el número es múltiplo de otro: ");
        esMultiplo(4, 2);

        System.out.println("Comprobar si un número es mayor o menor que otro: ");
        esMayor(3, 3);
    }


    public static void esPositivo(int numero) {
        if (numero >= 0) {
            System.out.println("El número " + numero + " es un número positivo.");
        } else {
            System.out.println("El número " + numero + " es un número negativo.");
        }
    }


    public static void esMultiplo(int numero1, int numero2) {

        if (numero1 % numero2 == 0) {
            System.out.println("El número " + numero1 + " es un múltiplo de " + numero2);
        } else {
            System.out.println("El número " + numero1 + " no es un múltiplo de " + numero2);
        }
    }

    public static void esMayor(int n, int n2) {
        if (n > n2) {
            System.out.println(n + " Es mayor que " + n2);
        } else if (n < n2) {
            System.out.println(n + " Es menor que " + n2);
        } else {
            System.out.println(n + " Es igual a " + n2);
        }
    }

//       public static void esMenor(int numero1,int numero2){
//       if (numero1<numero2){
//        System.out.println("El numero" + numero1 + "es menor que" + numero2);

//         }else { if ();
//        }
//           }

}


