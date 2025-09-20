package com.example;

public class Ejercicio7 {
    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
        // tu código aquí
        // Declarar variables
        String nombre = "Juan";
        String apellido = "Pérez";

        // Concatenar usando operador +
        String nombreCompleto = nombre + " " + apellido;

        // Concatenar usando concat()
        String saludo = "Hola ".concat(nombreCompleto);

        // Declarar edad y concatenar
        int edad = 20;
        String fraseEdad = "Tengo " + edad + " años";

        // Imprimir resultados
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println(saludo);
        System.out.println(fraseEdad);
    }
}
