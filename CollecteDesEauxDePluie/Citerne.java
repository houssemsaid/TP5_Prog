package com.company.CollecteDesEauxDePluie;

public class Citerne extends Destination {

    private int qte;

    private String nom;

    public Citerne(String s) { nom = s; }

    public int getQuantite() { return qte; }

    public void recoit(int n) {
        qte = qte + n;
        System.out.println(nom + ":" + qte);
    }

    public void vide(int n) { qte = qte - n; }

}
