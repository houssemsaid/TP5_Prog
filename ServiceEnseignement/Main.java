package com.company.ServiceEnseignement;

public class Main {

    public static void main(String[] args){

        ServicePermanent s = new ServicePermanent();
        s.ajouteHeuresCours(100);
        s.ajouteHeuresTD(30);
        s.ajouteHeuresTP(30);
        System.out.println(s.heuresEqTDEffectuees()); // affiche "210"
        System.out.println("Overtime : " + s.nbHeuresSup()); // affiche "18"
        ServiceMoniteur s2 = new ServiceMoniteur();
        s2.ajouteHeuresCours( 10);
        s2.ajouteHeuresTD(60);
        s2.ajouteHeuresTP( 30); // affiche "Trop d’heures"
        System.out.println(s2.heuresEqTDEffectuees()); // affiche "55
    }

}
