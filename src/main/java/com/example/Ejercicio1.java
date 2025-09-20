package com.example;

public class Ejercicio1 {
    public static void ejercicio1() {
        System.out.println("Ejercicio 1");
        // tu código aquí

        // Declaración de variables de diferentes tipos

        int entero = 10;                            // Entero
        double decimal = 3.14;                      // Número decimal
        String texto = "Hola, mundo";              // Cadena de texto
        boolean booleano = true;                   // Valor lógico
        int[] lista = {1, 2, 3, 4, 5};              // Arreglo de enteros (equivalente a una lista)
        int[] tupla = {6, 7, 8};                    // Java no tiene tuplas, usamos arreglo
        java.util.Set<Integer> conjunto = new java.util.HashSet<>();  // Conjunto
        conjunto.add(9);
        conjunto.add(10);
        conjunto.add(11);
        java.util.Map<String, Integer> diccionario = new java.util.HashMap<>(); // Diccionario (Map)
        diccionario.put("a", 1);
        diccionario.put("b", 2);

        // Mostrar los valores
        System.out.println("Entero: " + entero);
        System.out.println("Decimal: " + decimal);
        System.out.println("Texto: " + texto);
        System.out.println("Booleano: " + booleano);

        System.out.print("Lista: ");
        for (int num : lista) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Tupla: ");
        for (int num : tupla) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Conjunto: " + conjunto);
        System.out.println("Diccionario: " + diccionario);

    }
}
 