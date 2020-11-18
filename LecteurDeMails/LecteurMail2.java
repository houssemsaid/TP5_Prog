package com.company.LecteurDeMails;

public class LecteurMail2 extends LecteurMail {

    public LecteurMail2(String expediteur){
        super(expediteur);
    }

    public void suivant() {
        if(getNbMails() == 0)
            System.out.println("Pas de mails");
        else {
            setCourant(getPostion() + 1);
            lit();
            if(getPostion() == getNbMails())
                setCourant(0);
        }
    }

}
