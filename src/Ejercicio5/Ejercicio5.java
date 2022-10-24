package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner random = new Scanner(System.in);
        System.out.println("Escribe cualquier cosa: ");
        String txt = random.nextLine();

        if (txt.contains("b") || txt.contains("v")) {
            if (txt.contains("b") && txt.contains("p")){
                System.out.println("La frase contiene b y p");
            } else if (txt.contains("v") && txt.contains("u")){
                System.out.println("La frase escrita contiene las letras v y u");
            } else if (txt.contains("b")) {
                System.out.println("La frase contiene b pero no p");
            } else {
                System.out.println("La frase contiene v pero no u");
            }
        } else {
            System.out.println("La frase escrita no contiene ni la letra b ni la v");
        }
    }
}
