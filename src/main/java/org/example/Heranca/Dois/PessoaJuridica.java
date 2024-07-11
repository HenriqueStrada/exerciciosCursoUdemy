package org.example.Heranca.Dois;

public class PessoaJuridica extends Pessoa{
    private static Integer functionary;
    private static Double tax;
    public PessoaJuridica(String name, Double anualSalary, Integer functionary){
        super(name, anualSalary);
        PessoaJuridica.functionary = functionary;
    }

    public Integer getFunctionary() {
        return functionary;
    }

    public void setFunctionary(Integer functionary) {
        PessoaJuridica.functionary = functionary;
    }

    public static Double getTax() {
        if(functionary <= 10) {
            return tax = getAnualSalary() * 0.16;
        }else{
            return tax = getAnualSalary() * 0.14;
        }
    }
    public void setTax(Double tax) {
        PessoaJuridica.tax = tax;
    }
    public String toString() {
        return getName() + ": $ " + String.format("%.2f", getTax());
    }
}
