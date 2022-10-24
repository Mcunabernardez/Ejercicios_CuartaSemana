package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.println("Dame un número: ");
        double num =  calc.nextInt();
        double x = num%2;
        if (x == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}