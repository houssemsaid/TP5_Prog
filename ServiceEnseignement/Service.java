package com.company.ServiceEnseignement;

public class Service {


    private HeuresCours heuresCours;
    private HeuresTD heuresTD;
    private int heuresDues;
    private HeuresTP heuresTP;

    public Service(int heuresDues, HeuresTP heuresTP){
        this.heuresDues = heuresDues;
        this.heuresTP = heuresTP;
        this.heuresCours = new HeuresCours();
        this.heuresTD = new HeuresTD();
    }

    public HeuresCours getHeuresCours() { return heuresCours; }

    public HeuresTD getHeuresTD() { return heuresTD; }

    public HeuresTP getHeuresTP() { return heuresTP; }

    public int getHeuresDues() { return heuresDues; }


    public int heuresEqTDEffectuees() {
        return (int)(1.5 * heuresCours.getQte() + heuresTD.getQte() + heuresTP.getQte() * heuresTP.getCoeff());
    }

    public void ajouteHeuresCours(int h) {
        if(heuresTP instanceof HeuresTPPermanent || heuresEqTDEffectuees() + 1.5 * h < heuresDues)
            heuresCours.ajoute(heuresCours.getQte() + h);
        else
            System.out.println("Trop d’heures");
    }

    public void ajouteHeuresTD(int h) {
        if(heuresTP instanceof HeuresTPPermanent || heuresEqTDEffectuees() + h < heuresDues)
            heuresTD.ajoute(heuresTD.getQte() + h);
        else
            System.out.println("Trop d’heures");
    }

    public void ajouteHeuresTP(int h) {
        if(heuresTP instanceof HeuresTPPermanent || heuresEqTDEffectuees() + h * 2 / 3 < heuresDues)
            heuresTP.ajoute(heuresTP.getQte() + h);
        else
            System.out.println("Trop d’heures");
    }

}
