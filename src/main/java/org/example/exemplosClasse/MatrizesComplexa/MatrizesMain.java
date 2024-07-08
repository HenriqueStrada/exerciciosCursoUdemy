package org.example.exemplosClasse.MatrizesComplexa;

import javax.imageio.ImageTranscoder;
import java.util.Locale;
import java.util.Scanner;

public class MatrizesMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] Matriz = new int[m][n];

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                Matriz[i][j] = sc.nextInt();
            }
        }

        int b = sc.nextInt();

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                if(Matriz[i][j] == b){
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + Matriz[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + Matriz[i-1][j]);
                    }
                    if (j < Matriz[i].length-1) {
                        System.out.println("Right: " + Matriz[i][j+1]);
                    }
                    if (i < Matriz.length-1) {
                        System.out.println("Down: " + Matriz[i+1][j]);
                    }

                }
            }
        }


        sc.close();
    }
}
