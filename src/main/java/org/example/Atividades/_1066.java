package org.example.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class _1066 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int par=0, impar=0, nega=0, posi=0;
        int[] valores = new int[5];

        for (int i = 0; i < valores.length; i++){
            valores[i] = sc.nextInt();
        }

        for (int i = 0; i < valores.length; i++){
            if (valores[i] % 2 == 0){
                par++;
            }if (valores[i] % 2 != 0){
                impar++;
            }if (valores[i] > 0){
                posi++;
            }if (valores[i] < 0){
                nega++;
            }
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(posi + " valor(es) positivo(s)");
        System.out.println(nega + " valor(es) negativo(s)");
    }
}
