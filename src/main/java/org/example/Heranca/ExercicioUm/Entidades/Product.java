package org.example.Heranca.ExercicioUm.Entidades;

public abstract class Product {
    private String name;
    private Double price;
    protected Double finalPrice;
    public Product(String name, Double price, Double finalPrice){
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
    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getPriceTag() {
        return finalPrice;
    }

    public void setFinalPrice(Double price) {
        finalPrice = price;
    }
}
