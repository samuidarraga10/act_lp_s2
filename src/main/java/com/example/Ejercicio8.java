package com.example;

public class Ejercicio8 {
    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
        // tu código aquí
        // Variables con nombres válidos:
        int miVariable = 10;     // Válido: comienza con letra, contiene solo letras y no es palabra reservada
        int _contador = 20;      // Válido: puede empezar con guion bajo
        double $precio = 99.99;  // Válido: puede empezar con signo dólar
        int variable123 = 30;    // Válido: puede contener números, pero no puede comenzar con ellos

        // Variables con nombres inválidos:
        // int 123variable;      // Inválido: no puede comenzar con un número
        // int mi-variable;      // Inválido: el guion medio '-' no está permitido en identificadores
        // int class;            // Inválido: 'class' es palabra reservada en Java
        // int public;           // Inválido: 'public' es palabra reservada en Java

        // Explicación:
        // Los identificadores en Java deben comenzar con letra, guion bajo (_) o signo dólar ($).
        // No pueden empezar con números ni contener caracteres especiales como guion medio.
        // No pueden ser palabras reservadas del lenguaje.

        // Imprimir variables válidas
        System.out.println("miVariable: " + miVariable);
        System.out.println("_contador: " + _contador);
        System.out.println("$precio: " + $precio);
        System.out.println("variable123: " + variable123);
    }
}
