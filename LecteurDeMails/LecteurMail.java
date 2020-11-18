package com.company.LecteurDeMails;

public class LecteurMail {

    private BoiteMail boiteMail;
    private int nbMails;
    private int courant;
    private String expediteur;
    private Serveur serveur = new Serveur();

    public LecteurMail(String expediteur) {
        this.expediteur = expediteur;
    }

    public Mail getCourant() { return boiteMail.getMail(courant); }

    public String getExpediteur() { return expediteur; }

    public Serveur getServeur() { return serveur; }

    public int getNbMails(){return nbMails;}

    public int getPostion(){return courant;}

    public void setCourant(int courant){this.courant = courant;}

    public void lit(){
        getCourant().affiche();
    }

    public void suivant() {
        if(nbMails == 0)
            System.out.println("No mails");
        else {
            courant ++;
            if(courant == nbMails)
                courant = 0;
        }
    }

    public void ecrit(String destinataire, String sujet, String contenu) {
        serveur.envoie(new Mail(expediteur, destinataire, sujet, contenu));
    }

    public void repond(String reponse) {
        ecrit(expediteur,"Re:" + getCourant().getSujet(), getCourant().getContenu() + reponse);
    }

    public void transfere(String destinataire) {
        ecrit(destinataire, "Tr:" + getCourant().getSujet(), getCourant().getContenu());
    }

}
