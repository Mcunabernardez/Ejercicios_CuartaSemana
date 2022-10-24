package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner random = new Scanner(System.in);
        System.out.println("Escribe cualquier cosa: ");
         String txt = random.next();

         if (txt.contains("b")) { //como puedo hacer para que no discrimine CAPs?
             System.out.println("La palabra: \n"+txt+"\nContiene la letra b");
         } else {
             System.out.println("El texto escrito no contiene la letra b");
         }
    }
}
