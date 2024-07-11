package org.example.Heranca.Dois;

public class PessoaJuridica extends Pessoa{
    private Integer functionary;
    private Double tax;
    public PessoaJuridica(String name, Double anualSalary, Integer functionary){
        super(name, anualSalary);
        this.functionary = functionary;
    }

    public Integer getFunctionary() {
        return functionary;
    }

    public void setFunctionary(Integer functionary) {
        this.functionary = functionary;
    }

    public Double getTax() {
        if(functionary <= 10) {
            return tax = getAnualSalary() * 0.16;
        }else{
            return tax = getAnualSalary() * 0.14;
        }
    }
    public void setTax(Double tax) {
        this.tax = tax;
    }
    public String toString() {
        return getName() + ": $ " + String.format("%.2f", getTax());
    }
}
