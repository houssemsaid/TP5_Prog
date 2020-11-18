package com.company.CollecteDesEauxDePluie;

public class AlerteCiterne {

    private int seuil;
    private Citerne citerne;

    public AlerteCiterne(Citerne citerne, int seuil){
        this.citerne = citerne;
        this.seuil = seuil;
    }

    public void recoit(int n) {
        citerne.recoit(n);
        if(citerne.getQuantite() >= seuil){
            System.out.println("Seuil atteint");
        }
    }

    public int getSeuil(){return seuil;}

}
