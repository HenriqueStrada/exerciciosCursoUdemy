package org.example.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class _1064 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[6];
        double media = 0;
        int div = 0;
        for(int i = 0; i < notas.length; i++){
            notas[i] = sc.nextDouble();
        }

        for(int i = 0; i < notas.length; i++){
            if(notas[i] > 0){
                media += notas[i];
                div++;
            }
        }

        System.out.println(div + " valores positivos");
        System.out.printf("%.1f\n", (media / div));
    }
}
