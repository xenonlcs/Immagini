package com.es3.forme;

public class Rettangolo extends Forma {
    private double lato1, lato2;

    public Rettangolo(Colore colore, double lato1, double lato2) {
        super(colore);
        this.lato1 = lato1;
        this.lato2 = lato2;
    }

    public String toString(){
        return "Rettangolo:\n Colore: " + colore + "\n Lato1: " + lato1 + "\n Lato2: " + lato2 + "\n Area: " + getArea() + "\n";
    }


    @Override
    public double getArea() {
        return lato1 * lato2;
    }

    @Override
    public double getPerimetro() {
        return lato1 * 2 + lato2 * 2;
    }

}
