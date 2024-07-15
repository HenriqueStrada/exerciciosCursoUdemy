package org.example.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class _1051 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        if (salario <= 2000.0) {
            System.out.println("Isento");
        }else if (salario > 2000.0 && salario <= 3000.0){
            System.out.printf("R$ %.2f\n", (salario + salario * 0.08));
        }else if (salario > 3000.0 && salario <= 4500.0){
            System.out.printf("R$ %.2f\n", (salario + salario * 0.18));
        }else if (salario > 4500.0){
            System.out.printf("R$ %.2f\n", (salario + salario * 0.28));
        }
    }
}
