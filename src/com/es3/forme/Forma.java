package com.es3.forme;

public abstract class Forma implements Misurabile {//implements Comparable<Forma> {
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

    //public abstract double getArea();

    //public abstract double getPerimetro();

    @Override
    public int compareTo(Forma f){
        return Double.compare(this.getArea(), f.getArea());
    }

}
