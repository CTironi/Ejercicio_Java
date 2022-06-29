package com.sofka.proyect;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        try{
            Scanner entrada = new Scanner(System.in);
            Scanner entrada2 = new Scanner(System.in);

            System.out.println("Ingrese sueldo básico: ");
            double sueldo = entrada.nextDouble();
            System.out.println("Ingrese área de trabajo: ");
            String trabajo = entrada2.nextLine();
            System.out.println("Ingrese número de hijos: ");
            int hijos = entrada.nextInt();

            double total_pago = 0;
            double bonificacion = 0;
            
            if(trabajo.equals("Sistemas")){
                bonificacion = sueldo * 0.25;
            }else if(trabajo.equals("Contabilidad")){
                bonificacion = sueldo * 0.20;
            }else{
                bonificacion = sueldo * 0.10;
            }

            if(hijos >= 2){
                bonificacion += 150 * hijos;
            }

            total_pago = sueldo +bonificacion;

            System.out.println("El sueldo total es: " + total_pago);
        }catch (Exception e){
            System.out.println("Datos incorrectos");
        }

    }
}
