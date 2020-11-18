package com.company.CollecteDesEauxDePluie;

public class CiterneLimiteeAutovidante extends CiterneLimitee {

    public CiterneLimiteeAutovidante(String s, int seuil){
        super(s,seuil);
    }

    public void gere_surplus(){
        if(getQuantite() >= getAlerteCiterne().getSeuil()){
            vide(getQuantite() - getAlerteCiterne().getSeuil());
        }
    }

}
