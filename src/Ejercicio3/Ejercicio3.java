package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String Leche = "Leche";
        String Cacao = "Cacao";
        String Avellanas = "Avellanas";
        String Azucar = "Azucar";
        Scanner random = new Scanner(System.in);
        System.out.println("Leche\nCacao\nAvellanas\nAzucar\n\n¿Que quieres?");
        String option = random.next();
        if (option.equals(Leche)) {
            System.out.println("La "+option+" vale 1€");
        } else if (option.equals(Cacao)) {
            System.out.println("El "+option+" vale 2€");
        } else if (option.equals(Avellanas)) {
            System.out.println("Las "+option+" valen 4€");
        } else if (option.equals(Azucar)) {
            System.out.println("El "+option+" vale 1€");
        } else {
            System.out.println("El producto no está en la lista");
        }
    }
}