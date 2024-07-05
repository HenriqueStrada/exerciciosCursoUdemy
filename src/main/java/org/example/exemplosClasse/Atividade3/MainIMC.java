package org.example.exemplosClasse.Atividade3;
import java.util.Locale;
import java.util.Scanner;

public class MainIMC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int id = 1;
        String nome;
        int idade;
        double altura;
        double peso;

        do{
            System.out.println("Digite o id (digite 0 quando quiser parar): ");
            id = sc.nextInt();
        }while(id != 0);

        }
    }

