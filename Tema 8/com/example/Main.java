package com.example;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(21);
        persona.setNombre("Paco");
        persona.setTelefono("5000000000");
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}

