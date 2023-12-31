package com.campusdual.exercises.exercise14;

public class Person {
    protected String name;
    protected String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void showDetails() {
        System.out.println("El nombre de la persona es: " + getName());
        System.out.println("Su apellido es: " + getSurname());
    }
// En este caso no se pone this porque el método static no está referenciado con ningún this. La clase Persona no tienen ningún elemento estático al principio del eje.
// Una vble estática pertenece a la clase y no a un OBJETO
    public static void main(String[] args) {
        Person p1 = new Person("Gumersindo", "Doe");
        p1.showDetails();
    }

    public void getDetails() {
    }
// This hace referencia a los objetos.

}


