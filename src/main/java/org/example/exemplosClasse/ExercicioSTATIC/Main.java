package org.example.exemplosClasse.ExercicioSTATIC;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("What is the dollar price? %.2f\n", CurrencyConverter.DOLLAR);
        System.out.print("How many dollars will be bought? ");
        double quantity = sc.nextDouble();
        double Real = CurrencyConverter.boughtDollar(quantity);
        System.out.printf("Amount to be paid in reais = %.2f", Real);
        sc.close();
    }
}
