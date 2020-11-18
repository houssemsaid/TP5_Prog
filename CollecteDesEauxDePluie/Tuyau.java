package com.company.CollecteDesEauxDePluie;

public abstract class Tuyau extends Relais {

    private Destination[] destinataires;
    private GestionDestinataire gestionDestinataire;

    public Tuyau(int n){
        this.gestionDestinataire = super.getGestionDestinataire();
        destinataires = new Destination[n];
    }

    public abstract void fournit(int n);

    public abstract void ajouteDestinataire(Destination d);

    public void recoit(int n) { fournit(n); }

    public abstract void retireDestinataire(Destination d);

    public GestionDestinataire getGestionDestinataire(){return gestionDestinataire;}


}
