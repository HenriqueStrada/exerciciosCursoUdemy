package org.example.Heranca.ExercicioUm.Entidades;

public class UsedProduct extends Product{

    private String date;

    public UsedProduct(String name, Double price, String date) {
        super(name, price);
        this.date = date;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String toString(){
        return  getName() + " (used) Price $ " + String.format("%.2f",getPrice()) + " (Manufacture date: " + getDate() + ")";
    }

}
