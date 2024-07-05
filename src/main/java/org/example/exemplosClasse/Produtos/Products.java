package org.example.exemplosClasse.Produtos;

public class Products {
    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return "name = " + name
                + ", price = $ " + String.format("%.2f",price)
                + ", quantity = " + quantity + ", Total = "
                + String.format("%.2f", TotalValueInStock());
    }
}
