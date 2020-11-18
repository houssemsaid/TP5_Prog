package com.company.LecteurDeMails;

public class StrategieSuivanteLit {

    public void suivant(LecteurMail l){
        if(l.getNbMails() == 0)
            System.out.println("No mails");
        else {
            l.setCourant(l.getPostion() + 1);
            l.lit();
            if(l.getPostion() == l.getNbMails())
                l.setCourant(0);
        }
    }

}
