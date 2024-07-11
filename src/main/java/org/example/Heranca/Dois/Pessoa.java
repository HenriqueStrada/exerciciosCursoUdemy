package org.example.Heranca.Dois;

public class Pessoa {
    private String name;
    private static Double anualSalary;

    public Pessoa(){
    }
    public Pessoa(String name, Double anualSalary){
        this.name = name;
        Pessoa.anualSalary = anualSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Double getAnualSalary() {
        return anualSalary;
    }

    public void setAnualSalary(Double anualSalary) {
        Pessoa.anualSalary = anualSalary;
    }
}
