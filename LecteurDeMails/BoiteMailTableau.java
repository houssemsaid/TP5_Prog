package com.company.LecteurDeMails;

public class BoiteMailTableau extends BoiteMail {

    private Mail lesMails[] = new Mail[100];

    public BoiteMailTableau(String expediteur){
        super(expediteur);
    }

    public Mail getMail(int i){
        return lesMails[i];
    }

    public void recoit(Mail m){
        lesMails[getNbMails()] = m;
        setNbMails(getNbMails() + 1);
    }

}
