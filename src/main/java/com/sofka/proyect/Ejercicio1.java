package com.sofka.proyect;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar nro:");
        int nro = sc.nextInt();


        if((nro % 2) != 0){
            System.out.println("El numero es Impar" );
        }else if ((nro % 2) == 0){
            System.out.println("El numero es Par");
        }
    }
}
