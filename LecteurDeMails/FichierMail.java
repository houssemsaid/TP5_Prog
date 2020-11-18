package com.company.LecteurDeMails;

public class FichierMail extends Fichier {

    public FichierMail(Object contenue, String nom){
        super(contenue,nom);
    }

    public void execute(){
        System.out.println(getNom());
        System.out.println(getContenu());
    }

}
