package com.company;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Zadanie 3

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("kot", "cat");
        dictionary.put("pies", "dog");
        dictionary.put("dom", "house");
        dictionary.put("ryba", "fish");
        dictionary.put("mąż", "husband");
        dictionary.put("żona", "wife");
        dictionary.put("dziecko", "child");
        dictionary.put("samochód", "car");
        dictionary.put("niebo", "sky");
        dictionary.put("mleko", "milk");
        dictionary.put("lody", "ice cream");



        System.out.println("Podaj wyraz po polsku: ");

        Scanner scanner = new Scanner(System.in);
        String polishWord = scanner.nextLine();

        if (dictionary.containsKey(polishWord)) {
            System.out.println("Podane przez Ciebie słowo po angielsku, to : " + dictionary.get(polishWord.
                    toLowerCase()));

        } else {
            System.out.println("Nie znaleziono takiego słowa w słowniku.");
        }
    }
}
