package com.company.LecteurDeMails;

public class MailEnrichi extends Mail {

    private Fichier fichier;

    public MailEnrichi(String auteur, String destinataire, String sujet, String contenu){
        super(auteur,destinataire,sujet,contenu);
    }

    public void attache(Fichier fichier){
        this.fichier = fichier;
    }

    public Fichier recupere(){
        return fichier;
    }

    public void affiche(){
        super.affiche();
        if(fichier != null) {
            System.out.println("Att " + fichier.getNom());
        }
    }

}
