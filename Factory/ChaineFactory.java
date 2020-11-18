package com.company.Factory;

public class ChaineFactory {

    public static Expreg creeChaine(String chaine){
        if(chaine.length() == 0){
            return new Epsilon();
        }
        if(chaine.length() == 1){
            return new Symbole(chaine.charAt(0));
        }
        return new Concat(new Symbole(chaine.charAt(0)),creeChaine(chaine.substring(1)));
    }
}
