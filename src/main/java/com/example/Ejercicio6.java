package com.example;

import java.util.Scanner;

public class Ejercicio6 {
    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
        // tu código aquí
          // Crear objeto Scanner para leer datos desde consola
        Scanner scanner = new Scanner(System.in);

        // Solicitar y capturar nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar y capturar edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Solicitar y capturar altura
        System.out.print("Ingrese su altura (ejemplo 1.75): ");
        double altura = scanner.nextDouble();

        // Imprimir los datos capturados
        System.out.println("\nDatos capturados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);

        // cerrar scanner
        scanner.close();
    

    }
}
