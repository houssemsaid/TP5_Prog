package com.company.CollecteDesEauxDePluie;

public class TuyauSimple extends Tuyau implements Source {

    public TuyauSimple(){
        super(1);
    }

    public void fournit(int n) { getGestionDestinataire().getDestination(0).recoit(n); }

    public void ajouteDestinataire(Destination d) { getGestionDestinataire().setDestination(0,d); }

    public void retireDestinataire(Destination d) { getGestionDestinataire().setDestination(0,null); }

}
