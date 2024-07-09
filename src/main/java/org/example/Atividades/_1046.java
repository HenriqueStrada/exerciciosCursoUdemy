package org.example.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class _1046 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int inc = sc.nextInt();
        int fin = sc.nextInt();

        if (inc > fin) {
            System.out.println("O JOGO DUROU " + (24 - (inc - fin)) + " HORA(S)");
        } else if (fin > inc) {
            System.out.println("O JOGO DUROU " + (fin - inc) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

    }
}
