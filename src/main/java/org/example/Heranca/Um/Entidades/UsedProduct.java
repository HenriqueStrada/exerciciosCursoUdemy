package org.example.Heranca.Um.Entidades;

public class UsedProduct extends Product{

    private final String date;

    public UsedProduct(String name, Double price, String date) {
        super(name, price);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public String toString(){
        return  getName() + " (used) Price $ " + String.format("%.2f",getPrice()) + " (Manufacture date: " + getDate() + ")";
    }

}
