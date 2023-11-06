package com.campusdual.exercises.exerciseHerencia;

public class Animales {
protected int altura;
protected int peso;
protected int edad;

    public Animales(int altura, int peso, int edad) {
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

