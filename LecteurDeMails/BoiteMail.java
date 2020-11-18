package com.company.LecteurDeMails;

public abstract class BoiteMail {

    private int nbMails;
    private String expediteur;
    private Serveur serveur = new Serveur();

    public BoiteMail(String expediteur) {
        this.expediteur = expediteur;
    }

    public abstract Mail getMail(int i);

    public String getExpediteur() { return expediteur; }

    public int getNbMails() { return nbMails;}

    public void setNbMails(int n) { nbMails = n; }

    public abstract void recoit(Mail m);

    public void ecrit(String destinataire, String sujet, String contenu) {
        serveur.envoie(new Mail(expediteur, destinataire, sujet, contenu));
    }

}
