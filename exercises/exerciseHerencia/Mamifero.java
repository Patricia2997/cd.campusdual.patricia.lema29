package com.campusdual.exercises.exerciseHerencia;

public class Mamifero extends Animales{
    protected String habitat;
    protected int numeroDePatas;
    protected boolean cola;

    public Mamifero(int altura, int peso, int edad, String habitat, int numeroDePatas, boolean cola) {
        super(altura, peso, edad);
        this.habitat = habitat;
        this.numeroDePatas = numeroDePatas;
        this.cola = cola;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }
}
