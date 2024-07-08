package org.example.Atividades;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class _1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4;
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();

        double media = ((n1 * 2.0) + (n2 * 3.0) + (n3 * 4.0) + n4) / 10.0;
        System.out.printf("Media: %.1f\n", media);

        if (media >= 7.0){
            System.out.println("Aluno aprovado.");
        }else if (media < 7.0 && media >= 5.0){
            System.out.println("Aluno em exame.");
            double exame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", exame);
            double media_final = (media + exame) / 2;
            if(media_final >= 5.0){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", media_final);
            }else{
                DecimalFormat formato = new DecimalFormat("#.0");
                String numeroFormatado = formato.format(media_final);
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: " + numeroFormatado);
            }
        }else{
            System.out.println("Aluno reprovado.");
        }

        sc.close();
    }
}
