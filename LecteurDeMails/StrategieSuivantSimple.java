package com.company.LecteurDeMails;

public class StrategieSuivantSimple extends StrategieSuivant {

    public void suivant(LecteurMail l){
        if(l.getNbMails() == 0)
            System.out.println("No mails");
        else {
            l.setCourant(l.getPostion() + 1);
            if(l.getPostion() == l.getNbMails())
                l.setCourant(0);
        }
    }
}
