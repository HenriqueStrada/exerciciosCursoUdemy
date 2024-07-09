package org.example.Heranca.ExercicioUm.Entidades;

public class UsedProduct extends Product{

    private String date;

    public UsedProduct(String name, Double price, Double finalPrice, String date) {
        super(name, price, finalPrice);
        this.date = date;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

}
