package com.company.LecteurDeMails;

public class Notification extends BoiteMailTableau{

    public Notification(BoiteMail boiteMail){
        super(boiteMail.getExpediteur());
    }

    public void recoit(Mail m){
        super.recoit(m);
        System.out.println("You received a new mail.");
    }
}
