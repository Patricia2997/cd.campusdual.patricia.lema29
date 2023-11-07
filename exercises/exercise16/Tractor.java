package com.campusdual.exercises.exercise16;

public class Tractor implements IMachine{
    public int hp;

    public Tractor() {
        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void start() {
        System.out.println("El tractor está encendido");
    }


    public void stop() {
        System.out.println("El tractor está parado");
    }

    public void mantenaince() {
        System.out.println("El tractor está en mantenimiento");
    }

    public String getDetails(){
        return "La potencia del tractor es de " + this.getHp() + " HP";
    }

    public void forward(){
        System.out.println("El tractor avanza");
    }

    public void backward(){
        System.out.println("El tractor retrocede");
    }

}

