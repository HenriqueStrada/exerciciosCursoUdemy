package org.example.exemplosClasse.ExercicioSTATIC;

public class CurrencyConverter {

    public static final double DOLLAR = 3.10;
    public static double boughtDollar(double quantity){
        return (quantity * DOLLAR) + (quantity * DOLLAR * 0.06);
    }
}
