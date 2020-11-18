package com.company.CollecteDesEauxDePluie;

public interface GestionDestinataire {

    void ajoute(Destination d);
    void retire(Destination d);
    void fournit(int n);
    Destination[] getDestination();
    Destination getDestination(int index);
    void setDestination(int index,Destination d);

}
