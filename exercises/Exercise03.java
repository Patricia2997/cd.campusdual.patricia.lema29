package com.campusdual.exercises;

public class Exercise03 {

    public static String saludo(String nombre) {
        String mensaje = "Hola. Bienvenida " + "Patri";
        return mensaje;
    }

    public static void fechaActual(String fecha) {
        System.out.println(fecha);
    }


    public static void main(String[] args) {
        System.out.println(saludo("Patri"));
        fechaActual("19/10/2023");
    }
}
