package com.company.ServiceEnseignement;

public class HeuresEnseignement {

    private int qte;

    private double coeff;

    public int getQte() { return qte; }

    public void ajoute(int h) { qte = qte + h;}

    public double getCoeff() { return coeff; }

    public HeuresEnseignement(double coeff) { this.coeff = coeff; }

}
