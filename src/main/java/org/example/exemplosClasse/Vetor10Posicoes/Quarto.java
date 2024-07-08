package org.example.exemplosClasse.Vetor10Posicoes;

public class Quarto {
    private String name;
    private String email;

    public Quarto(String name, String email){
        this.name = this.name;
        this.email = this.email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return name + ", " + email;
    }
}
