package com.es3.forme;

public abstract class Forma implements Comparable<Forma> {
    Colore colore;

    public Forma(Colore colore) {
        this.colore=colore;

    }

    public Colore getColore() {
        return colore;
    }

    public void setColore(Colore colore) {
        this.colore = colore;
    }

    public abstract double area();

    public abstract double perimetro();

    @Override
    public int compareTo(Forma f){
        return Double.compare(this.area(), f.area());
    }

}
