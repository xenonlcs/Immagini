package com.es3.inkjet;

import com.es3.forme.Colore;
import com.es3.img.ImgVect;

import java.util.LinkedList;

public class InkJetPrinter {
    private final int MAXLEVEL = 1000;
    private LinkedList<Cartridge> cartridge;

    public InkJetPrinter() {
       cartridge = new LinkedList<Cartridge>();
       initCartridges();
    }

    private void initCartridges(){

        for(Colore colore: Colore.values()){
            cartridge.add(new Cartridge(colore, MAXLEVEL));
        }

    }

    public void changeCartridge(Colore colore){
        int i=0;
        for (Cartridge c: cartridge) {
            if(c.getColore().equals(colore)){
                c.setLevel(MAXLEVEL);
                //cartridge.set(i,c);
            }
            i++;
        }
    }

    public boolean checkCartridgesLevel(ImgVect iv){

        Cartridge temp;

        for(Colore colore: Colore.values()){
            for(int i=0; i<4; i++){
                temp=cartridge.get(i);
                if(temp.getColore() == colore){
                    if(temp.isEnough((int)iv.getSommaAree(colore))){
                        continue;
                    }else return false;
                }
            }

        }
        return true;
    }

    public void stampa(ImgVect iv){
        Cartridge temp;
        if(!checkCartridgesLevel(iv)) return;
        for(Colore colore: Colore.values()){
            for(int i=0; i<4; i++){
                temp=cartridge.get(i);
                if(temp.getColore() == colore){
                    temp.use((int)iv.getSommaAree(colore));
                    cartridge.set(i, temp);
                }
            }


        }
    }

    public void showCartridgesLevel(){
        for(Cartridge c: cartridge){
            System.out.println(c.toString());
        }
        /*System.out.println("Cartuccia 1: " + cartridge.get(0).getColore() + " " + cartridge.get(0).getLevel());
        System.out.println("Cartuccia 2: " + cartridge.get(1).getColore() + " " + cartridge.get(1).getLevel());
        System.out.println("Cartuccia 3: " + cartridge.get(2).getColore() + " " + cartridge.get(2).getLevel());
        System.out.println("Cartuccia 4: " + cartridge.get(3).getColore() + " " + cartridge.get(3).getLevel());
        */
    }
}
