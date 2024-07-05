package org.example.exemplosClasse.ClassesGetSet;

public class Bank {
    private int id;
    private String name;
    private double deposit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void Deposit(double deposit){
        this.deposit += deposit;
    }
    public void Withdraw(double withdraw){
        this.deposit = (deposit - 5.0) - withdraw ;
    }
    public double getDeposit() {
        return deposit;
    }

    public String toString(){
        return "Account " + id + ", Holder: " + name + ", Balance: $ " + String.format("%.2f",getDeposit());
    }
}
