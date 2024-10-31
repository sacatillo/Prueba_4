/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_pg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Martin Montes
 */
public class InventarioTienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> inventario = new HashMap<>();
        String respuesta;

        // Bucle para ingresar productos y sus cantidades en el inventario/AMMM
        do {
            // Solicitar nombre del producto
            System.out.print("Ingrese el nombre del producto: ");
            String producto = scanner.nextLine();

            // Solicitar cantidad en inventario para el producto
            System.out.print("Ingrese la cantidad en inventario de " + producto + ": ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();  

            // Agregar o actualizar la cantidad en el inventario
            inventario.put(producto, inventario.getOrDefault(producto, 0) + cantidad);

            // Preguntar si desea registrar otro producto
            System.out.print("Desea ingresar otro producto? (s/n): ");
            respuesta = scanner.nextLine();

        } while (respuesta.equalsIgnoreCase("s"));

        // Mostrar el inventario final :)
        System.out.println("\nInventario final:");
        int totalProductos = 0;
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + " - Cantidad: " + entry.getValue());
            totalProductos += entry.getValue();
        }

        // Mostrar las cantidades totales de productos registrados
        System.out.println("\nCantidad total de productos registrados: " + totalProductos);

        scanner.close();
    }
}


