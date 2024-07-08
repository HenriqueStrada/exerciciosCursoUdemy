package org.example.exemplosClasse.Atividade3;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MainIMC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int v = 0;
        int[] number = new int[50];
        int id;
        PessoaIMC[] vect = new PessoaIMC[50];

        System.out.println("Digite as informações (escreva 0 caso queira parar.)");
        System.out.println("Id: ");
        id = sc.nextInt();
        while(id != 0){
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            System.out.println("Peso: ");
            double peso = sc.nextDouble();

            vect[v] = new PessoaIMC(id, nome, idade, altura, peso);
            v++;
            System.out.println("Id: ");
            id = sc.nextInt();


        }
        System.out.println(v);
        ;
        for(int i = 0; i < v; i++){

        }
    }
}