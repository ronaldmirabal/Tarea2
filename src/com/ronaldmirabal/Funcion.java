package com.ronaldmirabal;

import java.util.Scanner;

public class Funcion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque el precio sin IVA: ");
        double price = scanner.nextDouble();
        System.out.println("El precio total es: "+ returnTotal(price, 18)); // El valor 18 corresponte al IVA en Republica Dominicana

    }

    static double returnTotal(double price, int iva){
        double impuesto = (price*iva)/100;
        return price + impuesto;
    }
}
