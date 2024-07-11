package org.example.Heranca.Dois;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainTax {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name;
        double anualSalary, health;
        int functionary;
        double totalImposto = 0;
        List<Pessoa> assessors = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            sc.nextLine();
            String question = sc.nextLine();

            if (question.equals("i")) {
                System.out.print("Name: ");
                name = sc.nextLine();
                System.out.print("Anual income: ");
                anualSalary = sc.nextDouble();
                System.out.print("Health expenditures: ");
                health = sc.nextDouble();
                Pessoa imp = new PessoaFisica(name, anualSalary, health);
                totalImposto += PessoaFisica.getTax();
                assessors.add(imp);
            } else if (question.equals("c")) {
                System.out.print("Name: ");
                name = sc.nextLine();
                System.out.print("Anual income: ");
                anualSalary = sc.nextDouble();
                System.out.print("Number of employees: ");
                functionary = sc.nextInt();
                Pessoa imp = new PessoaJuridica(name, anualSalary, functionary);
                totalImposto += PessoaJuridica.getTax();
                assessors.add(imp);
            }
        }
        System.out.println("TAXES PAID: ");
            for(Pessoa a : assessors){
                System.out.println(a);
            }

        System.out.printf("\nTOTAL TAXES: %.2f", totalImposto);
        }
    }
