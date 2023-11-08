package com.campusdual.exercises;

public class Cat {
    /*
     Crea una clase llamada Cat
     La clase debe tener las siguientes propiedades sin inicializar:
     - nombre (name)
     - raza (breed)
     - sexo (sex)
     - edad en meses (age) (estática)
     - tamaño del pelo (hair)
     - color del pelo (colour) (estática)
     - un booleano que indique si está castrado/a o no (castrated)I

     La clase debe tener las siguientes propiedades con los valores inicializados
     - el color de los ojos (eyeColour): "green"

     Crea un constructor que incluya todos los atributos no inicializados

     Crea un método estático que cambie el color del pelo y otro no estático que cambie el color de los ojos

     Crea un método estático que cambie la edad del gato y otro no estático que permita recuperar ese valor cuando se invoque

     Crea un método no estático que castre a los gatos y otro no estático, llamado isCastrated, que devuelva su estado

     Crea un método no estático llamado catDetails() que muestre todas las características de un gato (sé original en la presentación de los datos, dale un poco de arte)

     Crea un main()

     Crea un gato de la raza siamesa, otro de raza persa, y otro de raza esfinge

     Castra a los dos primeros gatos cambiando su booleano a true. Deja el otro gato sin castrar (false)

     Cámbiale el color del pelo a los dos primeros gatos

     Cámbiale el color de los ojos al último gato

     Cambia la edad del último gato. Intenta ponerle un valor negativo (su setter debe hacer la comprobación)

     Muestra los detalles de cada gato (fijaros qué dato muestra en la edad y el color del pelo)

     Vuelve a hacer el ejercicio en una nueva clase CatEncapsulated, aplicando la encapsulación (atributos private, ninguno estático, getters y setters)
      Verás cómo afecta a los métodos estáticos
    */
    public String name;
    public String breed;
    public static int age; // hacer cambios: STATIC
    public String sex;
    public String hair;
    public static String colour; // se pone static para hacer los cambios
    boolean castrado;
    private String eyeColour = "green"; //Vble inicializada al tener un color establecido

    public Cat(String name, String sex, String breed, String hair, String colour, boolean castrado, int age) {
        this.name = name;
        this.breed = breed;
        this.hair = hair;
        Cat.age = age;
        Cat.colour = colour;
        this.castrado = castrado;
        this.sex = sex;
    }
    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void changeColour(String newColour) {
        Cat.colour = newColour;
    }

    public void changeEyeColour(String azul) {
        System.out.println("El nuevo color de ojos es azul ");
        this.eyeColour = eyeColour = "Azul";
    }


    public static void changeAge(int newAge) {
        if (newAge > 0) {
            Cat.age = newAge;
        } else {
            System.out.println("No se admite el valor " + newAge + "porque es negativo.");
        }
    }

    public static int obtenerAge() {
        return age;
    }

    public void chageCastrado() {
        this.castrado = true;
    }

    public void Castrado() {
        if (this.castrado) {
            System.out.println("El gato está castrado");
        } else {
            System.out.println("El gato está castrado");
        }
    }

    public void catDetails() {
        System.out.println("Nombre: " + this.name + "   Edad: " + age + "   Sexo: " + this.sex + "     Raza: " +
                this.breed);
        System.out.println("Color de los ojos: " + this.eyeColour + "     Tipo de pelo: " + this.hair);
        System.out.println("Color del pelo: " + colour);
        System.out.println("  ");
    }


    public static void main(String[] args) {
        System.out.println("== Creo nuevo gato ==");
        Cat miCatLeo = new Cat("Leo", "macho", "siames", "corto", "marron", false, 12);
        System.out.println("Creo nuevo gato");
        Cat miCatNube = new Cat("Nube", "Hembra", "esfinge", "corto", "negro", false, 10);
        System.out.println("Creo nuevo gato");
        Cat miCatRabi = new Cat("Rabi", "Hembra", "Persa", "corto", "blanco", true, 6);
        System.out.println("== Muestro los detalles de los gatos ==");
        Cat.changeColour("azul");
        Cat.changeColour("verde");
        Cat.changeAge(9);
        miCatLeo.catDetails();
        miCatNube.catDetails();
        miCatRabi.catDetails();
        System.out.println("  ");
    }
}


