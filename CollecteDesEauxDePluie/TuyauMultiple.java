package com.company.CollecteDesEauxDePluie;

public class TuyauMultiple extends Tuyau implements Source {

    public TuyauMultiple(int n) {
        super(n);
    }

    public void fournit(int n) {
        for(int i = 0; i < getGestionDestinataire().getDestination().length; i++)
            if(getGestionDestinataire().getDestination(i) != null)
                getGestionDestinataire().getDestination(i).recoit(n/getGestionDestinataire().getDestination().length);
    }

    public void ajouteDestinataire(Destination d) {
        int i = 0;
        while(getGestionDestinataire().getDestination(i) != null) i = i + 1;
        getGestionDestinataire().setDestination(i,d);
    }

    public void retireDestinataire(Destination d) {
        int i = 0;
        while(getGestionDestinataire().getDestination(i) != d) i = i + 1;
        getGestionDestinataire().setDestination(i,null);
    }

}
