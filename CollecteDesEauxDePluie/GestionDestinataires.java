package com.company.CollecteDesEauxDePluie;

public class GestionDestinataires implements GestionDestinataire {

    private Destination[] destination;

    public GestionDestinataires(Destination[] destination){
        this.destination = destination;
    }

    public void fournit(int n) {
        for(int i = 0; i < destination.length ; i++)
            if(destination[i] != null)
                destination[i].recoit(n/destination.length);
    }

    public void ajoute(Destination d) {
        int i = 0;
        while(destination[i] != null) i = i + 1;
        destination[i] = d;
    }

    public void retire(Destination d) {
        int i = 0;
        while(destination[i] != d) i = i + 1;
        destination[i] = null;
    }

    public Destination[] getDestination(){
        return destination;
    }

    public Destination getDestination(int index){
        return destination[index];
    }

    public void setDestination(int index, Destination d){
        destination[index] = d;
    }

}
