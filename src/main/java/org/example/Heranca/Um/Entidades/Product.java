package org.example.Heranca.Um.Entidades;

public class Product {
    private String name;
    private Double price;

    public Product(){
    }
    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }

    public String toString(){
        return getName() + " $ " + String.format("%.2f",getPrice());
    }
}
