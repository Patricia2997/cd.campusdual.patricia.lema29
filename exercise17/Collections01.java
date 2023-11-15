package com.campusdual.exercise17;

import com.campusdual.exercises.exercise14.Doctor;
import com.campusdual.exercises.exercise14.Person;
import com.campusdual.exercises.exercise14.PoliceOfficer;
import com.campusdual.exercises.exercise14.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Collections01 {

    public static void main(String[] args) {
        List<Person> stringList = new ArrayList<>();
        Person persona1 = new Person("Pedro", "Delgado");
        stringList.add(new Person("Jhon", "Smith"));
        stringList.add(new Teacher("Maria", "Montessori", "Educación"));
        stringList.add(new PoliceOfficer("Jack", "Peralta", "B-99"));
        stringList.add(new Doctor("Gregory", "House", "Nefrología e infectología"));

    }
}
