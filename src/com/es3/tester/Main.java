package com.es3.tester;

import com.es3.forme.*;
import com.es3.forme.*;
import com.es3.img.ImgVect;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ImgVect immagine = new ImgVect(5);

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

        System.out.println("\n\nArea per blu: " + immagine.colorArea(Colore.BLUE) );
        System.out.println("Area per giallo: " + immagine.colorArea(Colore.YELLOW));
        System.out.println("Area per rosso: " +immagine.colorArea(Colore.RED));
        System.out.println("Area per nero: " +immagine.colorArea(Colore.BLACK) + "\n");

        Arrays.sort(immagine.getForme());
        System.out.println("Array ordinato per area");
        for(int i=0; i<immagine.getcForme(); i++){
            System.out.println(immagine.getForme()[i]);
        }





    }



}
