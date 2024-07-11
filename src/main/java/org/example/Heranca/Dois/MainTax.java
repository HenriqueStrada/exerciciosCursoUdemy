package org.example.Heranca.Dois;

import org.example.Heranca.Um.Entidades.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainTax {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name;
        double anualSalary, Health;
        int functionary;
        double imposto = 0;
        List<Pessoa> assessors = new ArrayList<>();
        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.println("Individual or company (i/c)?");
            sc.nextLine();
            String question = sc.nextLine();

            if(question.equals("i")){
                System.out.println("Name: ");
            }else if(question.equals("c")){
                System.out.print("Name: ");
                name = sc.nextLine();
                System.out.print("Anual income: ");
                anualSalary = sc.nextDouble();
                System.out.print("Number of employees: ");
                functionary = sc.nextInt();
                Pessoa imp = new PessoaJuridica(name, anualSalary, functionary);
                assessors.add(imp);
            }

            for(Pessoa a : assessors){
                System.out.println(a);
//                imposto += PessoaJuridica.getTax();
            }

            System.out.printf("TOTAL TAXES: $ %.2f", imposto);

        }
    }
}
