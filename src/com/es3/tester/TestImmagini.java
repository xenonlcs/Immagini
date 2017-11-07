package com.es3.tester;

import com.es3.forme.*;
import com.es3.forme.*;
import com.es3.img.ImgVect;

import java.util.Arrays;

public class TestImmagini {

    public static void main(String[] args) {
        ImgVect immagine = new ImgVect(10);

        Forma tempForma = new Cerchio(Colore.BLACK, 3);
        immagine.addForma(tempForma);

        tempForma=new Rettangolo(Colore.RED, 4,5);
        immagine.addForma(tempForma);

        tempForma=new Quadrato(Colore.RED, 4);
        immagine.addForma(tempForma);

        tempForma=new Rettangolo(Colore.YELLOW, 1,2);
        immagine.addForma(tempForma);

        tempForma=new Cerchio(Colore.BLUE, 10);
        immagine.addForma(tempForma);

        for(int i=0; i<immagine.getcForme(); i++){
            System.out.println(immagine.getForme()[i]);
        }

        System.out.println("\n\nArea per blu: " + immagine.getSommaAree(Colore.BLUE) );
        System.out.println("Area per giallo: " + immagine.getSommaAree(Colore.YELLOW));
        System.out.println("Area per rosso: " +immagine.getSommaAree(Colore.RED));
        System.out.println("Area per nero: " +immagine.getSommaAree(Colore.BLACK) + "\n");

        Arrays.sort(immagine.getForme(), 0, immagine.getcForme());
        System.out.println("Array ordinato per area");
        for(int i=0; i<immagine.getcForme(); i++){
            System.out.println(immagine.getForme()[i]);
        }

        ImgVect[] vectImg = new ImgVect[3];

        vectImg[0] = new ImgVect(5);
        tempForma = new Cerchio(Colore.BLACK, 3);
        vectImg[0].addForma(tempForma);
        tempForma=new Rettangolo(Colore.RED, 4,5);
        vectImg[0].addForma(tempForma);

        vectImg[1] = new ImgVect(5);
        tempForma=new Rettangolo(Colore.RED, 4,5);
        vectImg[1].addForma(tempForma);
        tempForma=new Quadrato(Colore.RED, 4);
        vectImg[1].addForma(tempForma);

        vectImg[2] = new ImgVect(5);
        tempForma=new Quadrato(Colore.RED, 4);
        vectImg[2].addForma(tempForma);
        tempForma=new Rettangolo(Colore.YELLOW, 1,2);
        vectImg[2].addForma(tempForma);

        Arrays.sort(vectImg, 0 ,3);
        System.out.println("Array ordinato per area");
        for(int i=0; i<3; i++){
            System.out.println(vectImg[i]);
        }
    }



}
