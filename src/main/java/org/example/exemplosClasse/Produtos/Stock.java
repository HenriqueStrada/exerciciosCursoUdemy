package org.example.exemplosClasse.Produtos;

import java.util.Locale;
import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Products products = new Products();
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        products.name = sc.nextLine();
        System.out.print("Price: ");
        products.price = sc.nextDouble();
        System.out.print("Quantity: ");
        products.quantity = sc.nextInt();
        System.out.println(products);
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        products.addProducts(quantity);
        System.out.println(products);
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        products.removeProducts(quantity);
        System.out.println(products);
        sc.close();
    }
}
