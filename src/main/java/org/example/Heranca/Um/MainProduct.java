package org.example.Heranca.Um;

import org.example.Heranca.Um.Entidades.ImportedProduct;
import org.example.Heranca.Um.Entidades.Product;
import org.example.Heranca.Um.Entidades.UsedProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainProduct{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        double price, customsFee;
        String date = "";
        String name;
        price = 0;
        customsFee = 0;
        name = "";
        List<Product> list = new ArrayList<Product>();
        for(int i = 1; i <= n; i++) {
            System.out.println("Product #" +  i + " data: ");
            System.out.println("Common, used, or imported (c/u/i)? ");
            String type = sc.next();
            if(type.equals("c")){
                System.out.print("Name: ");
                sc.nextLine();
                name = sc.nextLine();
                System.out.print("Price: ");
                price = sc.nextDouble();
                list.add(new Product(name, price));
            }else if(type.equals("i")){
                System.out.print("Name: ");
                sc.nextLine();
                name = sc.nextLine();
                System.out.print("Price: ");
                price = sc.nextDouble();
                System.out.print("Customs fee: ");
                customsFee = sc.nextDouble();
                ImportedProduct imp = new ImportedProduct(name, price, customsFee);
                list.add(imp);
            }else if(type.equals("u")){
                System.out.println("Name: ");
                sc.nextLine();
                name = sc.nextLine();
                System.out.print("Price: ");
                price = sc.nextDouble();
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                sc.nextLine();
                date = sc.nextLine();
                UsedProduct imp = new UsedProduct(name, price, date);
                list.add(imp);
            }
        }
        for(Product p : list){
            System.out.println(p);
        }
        sc.close();
    }
}
