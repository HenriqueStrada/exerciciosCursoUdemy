package org.example.exemplosClasse.ClassesGetSet;

import java.util.Locale;
import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        System.out.print("Enter account number: ");
        int id = sc.nextInt();
        bank.setId(id);
        System.out.print("Enter account name: ");
        String name = sc.nextLine();
        name = sc.nextLine();
        bank.setName(name);
        System.out.print("Is there na initial deposit (y/n)? ");
        char ch = sc.next().charAt(0);
        if (ch == 'y') {
            double depositAmount = sc.nextDouble();
            bank.Deposit(depositAmount);
        }else if (ch == 'n'){
            bank.Deposit(0.0);
        }
        System.out.println("Account Data: ");
        System.out.println(bank);

        System.out.print("Enter a deposit value: ");
        double depositAmount = sc.nextDouble();
        bank.Deposit(depositAmount);
        System.out.println("Account Data: ");
        System.out.println(bank);

        System.out.print("Enter a withdraw value: ");
        double withdrawAmount = sc.nextDouble();
        bank.Withdraw(withdrawAmount);
        System.out.println("Account Data: ");
        System.out.printf("Account " + bank.getId() + ", Holder: " + bank.getName() + ", Balance: $ %.2f", bank.getDeposit());


    }
}
