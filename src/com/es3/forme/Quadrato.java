package com.es3.forme;

public class Quadrato extends Forma  {
    private double lato;

    public Quadrato(Colore colore, double lato) {
        super(colore);
        this.lato = lato;
    }

    public String toString(){
        return "Quadrato:\n Colore: " + colore + "\n Lato: " + lato + "\n Area: " + area() + "\n";
    }

    @Override
    public double area() {
        return lato * lato;
    }

    @Override
    public double perimetro() {
        return 4 * lato;
    }


}
