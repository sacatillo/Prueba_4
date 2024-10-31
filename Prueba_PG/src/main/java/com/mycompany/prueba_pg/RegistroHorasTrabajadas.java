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
public class RegistroHorasTrabajadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de empleados/AMMM
        System.out.print("Ingrese el número de empleados: ");
        int numEmpleados = scanner.nextInt();

        // Procesar a los empleado
        for (int i = 1; i <= numEmpleados; i++) {
            System.out.println("\nEmpleado " + i + ":");

            int totalHoras = 0;

            // Solicita las horas trabajadas durante los 7 días de la semana de los empleados
            for (int dia = 1; dia <= 7; dia++) {
                System.out.print("Ingrese las horas trabajadas en el dia " + dia + ": ");
                int horas = scanner.nextInt();
                totalHoras += horas;
            }

            // Calcular el promedio diario de horas trabajadas
            double promedioDiario = totalHoras / 7.0;

            // Mostrar el total de horas y el promedio diario
            System.out.println("Total de horas trabajadas en la semana: " + totalHoras);
            System.out.printf("Promedio diario de horas trabajadas: %.2f\n", promedioDiario);
        }

        scanner.close();
    }
}

