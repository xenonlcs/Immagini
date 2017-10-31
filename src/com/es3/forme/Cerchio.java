package com.es3.forme;

import static java.lang.Math.PI;


public class Cerchio extends Forma {
    private double raggio;

    public Cerchio(Colore colore, double raggio) {
        super(colore);
        this.raggio = raggio;
    }

    public String toString(){
        return "Cerchio:\n Colore: " + colore + "\n Raggio: " + raggio + "\n Area: " + area() + "\n";
    }

    @Override
    public double area() {
        return raggio * raggio * PI;
    }

    @Override
    public double perimetro() {
        return raggio * 2 * PI;
    }



}
