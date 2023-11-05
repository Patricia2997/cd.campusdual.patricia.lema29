package com.campusdual.exercises.exercise14;

    public class Teacher extends Person{
        private  String area;

        public Teacher(String name, String surname, String area) {
            super(name, surname);
            this.area=area;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public static class Animal {
            public String mamifero;
            public String ave;
            public String pez;
            public int altura;
            public int peso;
            public int edad;
            boolean castrado;
            public Animal(String mamifero, String ave,String pez,int altura,int peso, int edad,boolean castrado){
                this.mamifero = mamifero;
                this.ave = ave;
                this.pez = pez;
                this.altura = altura;
                this.peso = peso;
                this.edad = edad;
                this.castrado = castrado;
            }

            public static void main(String[] args) {
            }
        }
    }

