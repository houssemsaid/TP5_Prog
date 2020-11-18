package com.company.LecteurDeMails;

public class LecteurMail3 extends LecteurMail {

    private StrategieSuivant strategieSuivant;

    public LecteurMail3(String expediteur){
        super(expediteur);
    }

    public void setStratégieSuivant(StrategieSuivant stratégieSuivant){
        this.strategieSuivant = stratégieSuivant;
    }

    public void suivant(){
        strategieSuivant.suivant(this);
    }
}
