package org.example.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class _1041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int m1 = n1;
        int m2 = n2;
        int m3 = n3;
        if (n1 < n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        if (n2 < n3) {
            int temp = n2;
            n2 = n3;
            n3 = temp;
        }
        if (n1 < n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        System.out.println(n3);
        System.out.println(n2);
        System.out.println(n1);
        System.out.println();
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

    }
}
