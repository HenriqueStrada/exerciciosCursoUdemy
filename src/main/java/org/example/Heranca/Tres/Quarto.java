package org.example.Heranca.Tres;

public class Quarto {
    private int id;
    private String CheckIn;
    private String CheckOut;

    public Quarto(){
    }
    public Quarto(int id, String CheckIn, String CheckOut) {
        this.id = id;
        this.CheckIn = CheckIn;
        this.CheckOut = CheckOut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(String checkIn) {
        CheckIn = checkIn;
    }

    public String getCheckOut() {
        return CheckOut;
    }

    public void setCheckOut(String checkOut) {
        CheckOut = checkOut;
    }
}
