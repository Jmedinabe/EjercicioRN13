package com.mycompany.ejerciciorn13;
import java.util.Scanner;
public class EjercicioRN13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de compra: ");
        double VALCOMP = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.print("Ingrese el color del producto (BLANCO, VERDE, AMARILLO o AZUL): ");
        String COLOR = scanner.nextLine().toUpperCase(); // Convertir a mayúsculas para evitar problemas de comparación

        int PDES; 

        if (COLOR.equals("BLANCO")) {
            PDES = 0;
        } else if (COLOR.equals("VERDE")) {
            PDES = 10;
        } else if (COLOR.equals("AMARILLO")) {
            PDES = 25;
        } else if (COLOR.equals("AZUL")) {
            PDES = 50;
        } else {
            PDES = 100;
        }

        double VALPAG = VALCOMP - (PDES * VALCOMP / 100);

        System.out.println("EL CLIENTE DEBE PAGAR: $" + VALPAG);

        scanner.close();
    }
}
