package com.sofka.proyect;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int millas;
        double km;
        System.out.println("Convertir Millas a Kilometros.\n Utilizar 0 para salir.");
        do {

            System.out.print("Introduce millas: ");
            millas = sc.nextInt();

            if (millas != 0) {
                km = millas * 1.6093;
                System.out.printf("%d millas equivalen a %.2f KM %n", millas, km);
            }

        } while (millas != 0);
    }

}
