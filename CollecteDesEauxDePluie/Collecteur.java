package com.company.CollecteDesEauxDePluie;

public class Collecteur implements Source {

    private Destination destination;

    public void fournit(int n) { destination.recoit(n); }

    public void ajouteDestinataire(Destination d) { destination = d; }

    public void retireDestinataire(Destination d) { destination = null; }

}
