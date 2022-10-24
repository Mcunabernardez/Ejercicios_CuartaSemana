package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner random = new Scanner(System.in);
        System.out.println("Elige un número: ");
        int num = random.nextInt();

        if (num < 10) {
            System.out.println("El número "+num+" es menor que 10");
        } else if (num > 10) {
            System.out.println("El número "+num+" es mayor que 10");
        } else {
            System.out.println("El número es igual a 10");
        }
    }
}
