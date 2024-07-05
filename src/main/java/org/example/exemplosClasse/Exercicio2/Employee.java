package org.example.exemplosClasse.Exercicio2;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    public double salary;

    public double NetSalary(){

        return salary = grossSalary - tax;
    }
    public void IncreaseSalary(double percentage){
        //percentage / 100;
    }

    public String toString(){
        return "Employee: " + name + ", $ " + String.format("%.2f", NetSalary());
    }
}
