package org.example.exemplosClasse.Exercicio1;
import static java.lang.Math.sqrt;

public class Rectangle {

    public double Width;
    public double Height;

    public double Area(){
        return Width * Height;
    }
    public double Perimeter(){
        return (Width * 2) + (Height * 2);
    }
    public double Diagonal(){
        return Math.sqrt((Width * Width) + (Height * Height));
    }

    public String toString() {
        return "AREA = " + String.format("%.2f", Area())
                + "\nPERIMETER = " + String.format("%.2f", Perimeter())
                + "\nDIAGONAL = " + String.format("%.2f", Diagonal());
    }
}

//    return "AREA = " + Area()
//            + "\nPERIMETER = " + Perimeter()
//            + "\nDIAGONAL = " + Diagonal();

//        return "AREA = " + String.format("%.f2", Area())
//        + "\nPERIMETER = " + String.format("%.f2", Perimeter())
//        + "\nDIAGONAL = " + String.format("%.f2", Diagonal());