package org.example.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class _1065 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int par = 0;
        int[] valores = new int[5];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextInt();
        }

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0) {
                par++;
            }
        }
        System.out.println(par + " valores pares");
    }
}