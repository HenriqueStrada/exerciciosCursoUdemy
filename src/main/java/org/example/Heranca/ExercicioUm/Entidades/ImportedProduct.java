package org.example.Heranca.ExercicioUm.Entidades;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }
    public Double getCustomsFee() {
        return customsFee;
    }
    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public void setFinalPrice(){
        finalPrice = customsFee + price;
    }

    public String toString(){
        return getName() + " $ " + String.format("%.2f",setFinalPrice());
    }
}
