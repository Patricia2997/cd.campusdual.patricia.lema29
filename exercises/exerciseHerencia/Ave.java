package com.campusdual.exercises.exerciseHerencia;

public class Ave extends Animales {
    protected String habitat;
    protected String colorPlumas;
    protected int numeroPatas;

    public Ave(int altura, int peso, int edad, String habitat, String colorPlumas, int numeroPatas) {
        super(altura, peso, edad);
        this.habitat = habitat;
        this.colorPlumas = colorPlumas;
        this.numeroPatas = numeroPatas;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
}
