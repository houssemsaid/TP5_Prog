package com.company.CollecteDesEauxDePluie;

public interface Source {

    void fournit(int n);
    void ajouteDestinataire(Destination d);
    void retireDestinataire(Destination d);

}
