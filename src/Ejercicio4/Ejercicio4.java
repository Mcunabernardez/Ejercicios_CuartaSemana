package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        String a = "triangulo";
        String b = "rectangulo";
        String c = "pentagono";
        String d = "hexagono";
        Scanner random = new Scanner(System.in);
        System.out.println("Triángulo\nRectángulo\nPentágono\nHexágono\n\n¿El área de que figura geométrica necesitas calcular?");
        String option = random.next();
        double base;
        double h;
        double L;
        double apotema;


        if (option.equals(a)){
            System.out.println("Para calcular el área de un triángulo necesitamos la base y la altura.\nDime la base: ");
            base = random.nextInt();
            System.out.println("Ahora dime la altura: ");
            h = random.nextInt();
            double at = (base*h)/2;
            System.out.println("El área del triángulo deseado es:\n"+at);
        } else if (option.equals(b)) {
            System.out.println("Para calcular el área de un rectángulo necesitamos la base y la altura.\nDime la base: ");
            base = random.nextInt();
            System.out.println("Ahora dime la altura: ");
            h = random.nextInt();
            double ar = base*h;
            System.out.println("El área del rectángulo deseado es:\n"+ar);
        } else if (option.equals(c)) {
            System.out.println("Para calcular el área de un pentágono necesitamos un lado y el apotema .\nDime la longitud de un lado : ");
            L = random.nextInt();
            System.out.println("Ahora dime la longitud del apotema");
            apotema = random.nextInt();
            double ap = (5*L*apotema)/2;
            System.out.println("El área del pentágono es:\n"+ap);
        } else if (option.equals(d)) {
            System.out.println("Para calcular el área de un hexágono necesitamos un lado y el apotema .\nDime la longitud de un lado : ");
            L = random.nextInt();
            System.out.println("Ahora dime la longitud del apotema");
            apotema = random.nextInt();
            double ah = (6*L*apotema)/2;
            System.out.println("El área del hexágono es:\n"+ah);
        } else {
            System.out.println("Error. Dime una figura geométrica de la lista");
        }
    }
}
