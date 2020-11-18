package com.company.CollecteDesEauxDePluie;

public abstract class CiterneLimitee extends Citerne{

    private AlerteCiterne alerteCiterne;

    public CiterneLimitee(String s, int seuil){
        super(s);
        alerteCiterne = new AlerteCiterne(this,seuil);
    }

    public abstract void gere_surplus();

    public AlerteCiterne getAlerteCiterne(){return alerteCiterne;}

}
