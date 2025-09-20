package com.example;

import java.util.Scanner;

public class Ejercicio10 {
    public static void ejercicio10() {
        System.out.println("Ejercicio 10");
        // tu código aquí
           // Declaración de constantes
        final double precioProducto = 15.99;
        final int ivaPorcentaje = 16;

        // Crear Scanner para captura
        Scanner scanner = new Scanner(System.in);

        // Captura de datos del usuario
        System.out.print("Ingrese la cantidad de productos: ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        // Cálculos
        double subtotal = precioProducto * cantidadProductos;
        double iva = subtotal * ivaPorcentaje / 100;
        double total = subtotal + iva;

        // Imprimir factura
        System.out.println("\n----- Factura -----");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Cantidad de productos: " + cantidadProductos);
        System.out.println("Precio unitario: $" + precioProducto);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (" + ivaPorcentaje + "%): $" + iva);
        System.out.println("Total a pagar: $" + total);
        System.out.println("-------------------");

        // Cerrar Scanner
        scanner.close();
    
    }
}
