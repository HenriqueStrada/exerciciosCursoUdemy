package org.example.Heranca.ExercicioUm;

import org.example.Heranca.ExercicioUm.Entidades.ImportedProduct;
import org.example.Heranca.ExercicioUm.Entidades.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        List<Product> list = new ArrayList<Product>();
        for(int i = 0; i <= n; i++) {
            System.out.println("Product #1 data: ");
            System.out.println("Common, used, or imported (c/u/i)? ");
            String type = sc.next();
            if(type.equals("c")){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                Product imp = new ImportedProduct(name, price, customsFee);
                list.add(imp);
            }
        }
    }
}
