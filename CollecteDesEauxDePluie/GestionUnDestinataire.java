package com.company.CollecteDesEauxDePluie;

public class GestionUnDestinataire implements GestionDestinataire {

    private Destination[] destination = new Destination[1];

    public GestionUnDestinataire(Destination destination){
        this.destination[0] = destination;
    }

    public void fournit(int n) {
        destination[0].recoit(n);
    }

    public void ajoute(Destination d) { destination[0] = d; }

    public void retire(Destination d) { destination[0] = null; }

    public Destination[] getDestination(){return destination;}

    public Destination getDestination(int index){return destination[0];}

    public void setDestination(int index,Destination d){
        destination[index] = d;
    }

}
