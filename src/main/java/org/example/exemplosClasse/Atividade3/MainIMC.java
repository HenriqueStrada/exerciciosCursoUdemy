package org.example.exemplosClasse.Atividade3;
import java.util.Locale;
import java.util.Scanner;

public class MainIMC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int id = 1;
        int[] idv = new int[100];
        String nome;
        String[] nomev = new String[100];
        int idade;
        int[] idadev = new int[100];
        double altura;
        double[] alturav = new double[100];
        double peso;
        double[] pesov = new double[100];
            System.out.println("Digite o id (digite 0 quando quiser parar): ");
            id = sc.nextInt();
        while(id != 0){
            idv[i] = id;
            System.out.println("Nome:");
            nome = sc.next();
            nomev[i] = nome;
            System.out.println("Idade:");
            idade = sc.nextInt();
            idadev[i] = idade;
            System.out.println("Altura:");
            altura = sc.nextDouble();
            alturav[i] = altura;
            System.out.println("Peso:");
            peso = sc.nextDouble();
            pesov[i] = peso;
            i++;
            System.out.println("Digite o id (digite 0 quando quiser parar): ");
            id = sc.nextInt();
        }
            for(int j = 0; j < i; j++){
                System.out.println(idv[j]);
                System.out.println(nomev[j]);
                System.out.println(idadev[j]);
                System.out.println(alturav[j]);
                System.out.println(pesov[j]);
            }
        }
    }

