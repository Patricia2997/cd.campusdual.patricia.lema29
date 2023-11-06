package com.campusdual.exercises.exerciseHerencia;

public class Pez extends Animales {
    protected String habitat;
    protected int aletas;
    public int branquias; // Nm d branquias

    public Pez(int altura, int peso, int edad, String habitat, int aletas, int branquias) {
        super(altura, peso, edad);
        this.habitat = habitat;
        this.aletas = aletas;
        this.branquias = branquias;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getAletas() {
        return aletas;
    }

    public void setAletas(int aletas) {
        this.aletas = aletas;
    }

    public int getBranquias() {
        return branquias;
    }

    public void setBranquias(int branquias) {
        this.branquias = branquias;
    }
}
