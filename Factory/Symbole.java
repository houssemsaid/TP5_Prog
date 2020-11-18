package com.company.Factory;


public class Symbole implements ExpregBase {

    private String symbole = "";

    public Symbole(char symbole){
        this.symbole = this.symbole + symbole;
    }

    public String toString(){
        return symbole;
    }
}
