package org.example.exemplosClasse.Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.Height = sc.nextDouble();
        rectangle.Width = sc.nextDouble();

        System.out.println(rectangle);
    }
}
