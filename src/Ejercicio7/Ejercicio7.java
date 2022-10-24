package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner random = new Scanner(System.in);
        System.out.println("Escribe cualquier cosa: ");
        String txt = random.nextLine();
        double X = txt.length()%2;
        if (X == 0) {
            System.out.println("El número de caracteres es par");
        } else {
            System.out.println("El número de caracteres es impar");
        }
    }
}