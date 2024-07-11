package org.example.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class _1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, aux1, aux2;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if(a > b && a > c){
            if(c >= b){
                aux1 = b;
                b = c;
                c = aux1;
            }
        }else if(b > a && b > c){
            if (c >= a) {
                aux1 = c;
                aux2 = a;
                a = b;
                b = aux1;
                c = aux2;
            }
        }else if(c > a && c > b){
            if (a >= b){
                aux1 = a;
                aux2 = b;
                a = c;
                b = aux1;
                c = aux2;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        if(a >= b + c){
            System.out.println("NAO FORMA TRIANGULO");
        }else if(a * a == (b * b + c * c)){
            System.out.println("TRIANGULO RETANGULO");
        }else if (a * a > (b * b + c * c)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }else if(a * a < (b * b + c * c)){
            System.out.println("TRIANGULO ACUTANGULO");
        }else if(a == b && a == c) {
            System.out.println("TRIANGULO EQUILATERO");
        }else if(a == b){
            System.out.println("TRIANGULO ISOSCELES");
        }else if(a == c){
            System.out.println("TRIANGULO ISOSCELES");
        }else if(b == c){
            System.out.println("TRIANGULO ISOSCELES");
        }
        sc.close();
    }
}
