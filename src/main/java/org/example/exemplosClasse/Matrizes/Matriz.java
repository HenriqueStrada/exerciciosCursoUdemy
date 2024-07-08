package org.example.exemplosClasse.Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int negative = 0;
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] < 0){
                    negative++;
                }
            }
        }

        System.out.println("Main diagonal:");

        for (int i = 0; i < n; i++){
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
        System.out.println("Negative numbers = " + negative);

        sc.close();
    }
}

