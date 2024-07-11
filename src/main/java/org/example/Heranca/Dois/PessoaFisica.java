package org.example.Heranca.Dois;

public class PessoaFisica extends Pessoa {
    private static Double healthSpent;
    private static Double tax;
    public PessoaFisica(){
    }
    public PessoaFisica(String name, Double anualSalary, Double healthSpent){
        super(name, anualSalary);
        PessoaFisica.healthSpent = healthSpent;
    }

    public static Double getHealthSpent() {
        return healthSpent;
    }

    public void setHealthSpent(Double healthSpent) {
        PessoaFisica.healthSpent = healthSpent;
    }

    public static Double getTax() {
        if(getAnualSalary() < 20000.00){
            return tax = (getAnualSalary() * 0.15) - (getHealthSpent() * 0.50);
        }else{
            return tax = (getAnualSalary() * 0.25) - (getHealthSpent() * 0.50);
        }
    }
    public void setTax(Double tax) {
        PessoaFisica.tax = tax;
    }
    public String toString(){
        return getName() + " $ " + String.format("%.2f",getTax());
    }



}
