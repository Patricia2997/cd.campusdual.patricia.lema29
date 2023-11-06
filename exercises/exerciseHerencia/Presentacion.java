package com.campusdual.exercises.exerciseHerencia;

public class Presentacion {
    public static void main(String[] args) {
        Cabalo c1 = new Cabalo(5,100, 2,"establo",4, true, "equs", "Spirit", "Coris", "HIHI");
        c1.presentarse();
        Perro1 p1 = new Perro1(2,12,3,"casa", 4, true, "canius domesticus", "Balto", "Coris", "GUAU");
        Delfin d1 = new Delfin(13,100, 2,"Mar", 2, 6, "Delfinius", "Flipper", "Oceano", "IIIIII");
        Orca o1 = new Orca(10,200, 6, "Mar", 2,6,"Orqus", "Willy", "Mar", "jijiji");
        Halcon h1 = new Halcon(1,2,3, "aire","negro",2, "Falco", "Lisa", "aire", "gruñir");
        Pollo u1 = new Pollo(2,5,1, "tierra","blanco",2, "Gallus", "Calimero", "terra", "Kikiriki");
        p1.presentarse();
        d1.presentarse();
        o1.presentarse();
        h1.presentarse();
        u1.presentarse();
    }
}
