package com.example;

public class Main {
    public static void main(String[] args) {

        //CONDICIONAL IF
        int numeroIf = -1;
        if (numeroIf > 0) {
            System.out.println("El número es +");
        } else if (numeroIf < 0) {
            System.out.println("El número es -");
        } else {
            System.out.println("El número es 0");
        }

        System.out.println("-------------------");

        //BUCLE WHILE
        int numeroWhile = -2;
        while (numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
            System.out.println("Bucle While número: " + numeroWhile);
        }

        System.out.println("-------------------");

        //BUCLE DO WHILE
        numeroWhile = 3;
        do {
            System.out.println("Bucle Do While número: " + numeroWhile);
        } while (numeroWhile < 3);

        System.out.println("-------------------");

        //BUCLE FOR
        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1) {
            System.out.println("Bucle For número: " + numeroFor);
        }

        System.out.println("-------------------");

        //SWITCH CASE
        String estacion = "";
        switch (estacion = "VERANO") {
            case "VERANO":
                System.out.println("Estamos en ¡VERANO!");
                break;
            case "INVIERNO":
                System.out.println("Estamos en ¡INVIERNO!");
                break;
            case "PRIMAVERA":
                System.out.println("Estamos en ¡PRIMAVERA!");
                break;
            case "OTOÑO":
                System.out.println("Estamos en ¡OTOÑO!");
                break;
            default:
                System.out.println("Este dato no es una ESTACIÓN");
        }
    }
}