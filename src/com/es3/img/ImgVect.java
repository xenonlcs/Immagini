package com.es3.img;

import com.es3.forme.Colore;
import com.es3.forme.Forma;
import com.es3.forme.Misurabile;

public class ImgVect implements Comparable<ImgVect>{
    private int maxForme;
    private int cForme;
    private Forma[] forme;

    public ImgVect(int maxForme) {
        this.maxForme = maxForme;
        forme = new Forma[maxForme];
        cForme = 0;
    }

    public void addForma(Forma newForma) {
        if (cForme < maxForme) {
            forme[cForme] = newForma;
            cForme++;
        }
    }

    public double getSommaAree() {
        double area = 0;
        for (int i = 0; i < cForme; i++) {
            area += forme[i].getArea();
        }
        return area;
    }

    public double getSommaAree(Colore colore) {
        double area = 0;
        for (int i = 0; i < cForme; i++) {
            if (forme[i].getColore() == colore) {
                area += forme[i].getArea();
            }
        }
        return area;
    }

    public int getMaxForme() {
        return maxForme;
    }

    public void setMaxForme(int maxForme) {
        this.maxForme = maxForme;
    }

    public int getcForme() {
        return cForme;
    }

    public void setcForme(int cForme) {
        this.cForme = cForme;
    }

    public Forma[] getForme() {
        return forme;
    }

    public void setForme(Forma[] forme) {
        this.forme = forme;
    }

    @Override
    public String toString(){
        return "Immagine con " + cForme + " forme. Area totale: " + getSommaAree();
    }

    @Override
    public int compareTo(ImgVect imgVect) {
        return Double.compare(this.getSommaAree(), imgVect.getSommaAree());
    }
}
