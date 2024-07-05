package org.example.exemplosClasse.Exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        System.out.println(employee);
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);
        System.out.println(employee);

    }
}
