package org.example.Heranca.Dois;

public class Pessoa {
    private String name;
    private Double anualSalary;

    public Pessoa(){
    }
    public Pessoa(String name, Double anualSalary){
        this.name = name;
        this.anualSalary = anualSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualSalary() {
        return anualSalary;
    }

    public void setAnualSalary(Double anualSalary) {
        this.anualSalary = anualSalary;
    }
}
