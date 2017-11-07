package com.es3.forme;

public class Quadrato extends Forma  {
    private double lato;

    public Quadrato(Colore colore, double lato) {
        super(colore);
        this.lato = lato;
    }

    public String toString(){
        return "Quadrato:\n Colore: " + colore + "\n Lato: " + lato + "\n Area: " + getArea() + "\n";
    }

    @Override
    public double getArea() {
        return lato * lato;
    }

    @Override
    public double getPerimetro() {
        return 4 * lato;
    }


}
