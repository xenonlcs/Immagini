package com.es3.inkjet;

import com.es3.forme.Colore;

public class Cartridge {
    private Colore colore;
    private int level;

    public Cartridge(Colore colore, int level){
        this.colore = colore;
        this.level = level;
    }

    public Colore getColore() {
        return colore;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isEnough(int value){
        return level-value>=0 ? true : false;
    }

    public boolean use(int value){
        if(isEnough(value)){
            level-=value;
            return true;
        }else return false;
    }

    public String toString(){
        return "Cartuccia\n  colore: " + colore + "\n  livello: " + level;
    }
}
