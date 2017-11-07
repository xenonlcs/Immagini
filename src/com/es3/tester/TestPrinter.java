package com.es3.tester;

import com.es3.forme.Cerchio;
import com.es3.forme.Colore;
import com.es3.forme.Rettangolo;
import com.es3.img.ImgVect;
import com.es3.inkjet.InkJetPrinter;

public class TestPrinter {
    public static void main(String[] args) {
        InkJetPrinter ijp = new InkJetPrinter();
        ImgVect iv = new ImgVect(10);
        iv.addForma(new Rettangolo(Colore.BLACK , 1, 10));
        iv.addForma(new Cerchio(Colore.BLUE, 10));
        ijp.showCartridgesLevel();
        System.out.println("\n");
        ijp.stampa(iv);
        ijp.showCartridgesLevel();
        ijp.changeCartridge(Colore.BLUE);
        System.out.println("\n");
        ijp.showCartridgesLevel();

    }
}
