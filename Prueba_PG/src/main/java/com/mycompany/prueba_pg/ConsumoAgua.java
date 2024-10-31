/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_pg;

import java.util.Scanner;

/**
 *
 * @author Martin Montes
 */
public class ConsumoAgua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar el consumo total y el consumo de cada mes/AMMM
        double consumoTotal = 0;
        double[] consumoMensual = new double[12];

        // Solicita el consumo de agua para cada uno de los 12 meses
        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese el consumo de agua en litros para el mes " + (i + 1) + ": ");
            consumoMensual[i] = scanner.nextDouble();
            consumoTotal += consumoMensual[i];
        }

        // Calcular el promedio mensual de consumo
        double promedioMensual = consumoTotal / 12;

        // Mostrar el consumo total y el promedio mensual
        System.out.printf("\nEl consumo total de agua en el año es: %.2f litros\n", consumoTotal);
        System.out.printf("El consumo promedio mensual es: %.2f litros\n", promedioMensual);

        scanner.close();
    }
}

