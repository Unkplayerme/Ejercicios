package com.example;

public class Main {

        public static void main(String[] args) {
            suma(7, 21, 32);
            Coches miCoche = new Coches();
            miCoche.addPuerta();
            miCoche.addPuerta();
            miCoche.addPuerta();
            System.out.println("El numero de puertas es: " + miCoche.puertas);
        }
        public static int suma(int a, int b, int c){
            int resultado = a + b + c;
            System.out.println(resultado);
            return (resultado);
        }
}
