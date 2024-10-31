/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba_pg;

import java.util.Scanner;

/**
 *
 * @author Martin Montes
 */
public class Supermercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de productos a registrar/AMMM
        System.out.print("Cuantos productos desea registrar? (Cuantos llevara) ");
        int numProductos = scanner.nextInt();

        // Inicializar el costo total
        double costoTotal = 0;

        // Ciclo para ingresar el precio y cantidad de cada producto
        for (int i = 1; i <= numProductos; i++) {
            System.out.println("\nProducto " + i);

            // Solicitar el precio del producto
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();

            // Solicitar la cantidad del producto
            System.out.print("Ingrese la cantidad comprada: ");
            int cantidad = scanner.nextInt();

            // Calcular el costo del producto y agregar al total
            costoTotal += precio * cantidad;
        }

        // Mostrar el costo total de la compra
        System.out.printf("\nEl costo total de la compra es: L %.2f\n", costoTotal);

        scanner.close();
    }
}

    
