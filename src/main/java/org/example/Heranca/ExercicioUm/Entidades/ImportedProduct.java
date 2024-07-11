package org.example.Heranca.ExercicioUm.Entidades;

public class ImportedProduct extends Product {
    private final Double customsFee;
    public ImportedProduct(String name, Double price, Double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }
    public Double getCustomsFee() {
        return customsFee;
    }

    public Double getFinalPrice() {
        return this.getPrice() + customsFee;
    }

    public String toString(){
        return getName() + " $ " + String.format("%.2f",getFinalPrice()) + " (Customs fee: $ " + String.format("%.2f",getCustomsFee()) + ")";
    }
}
