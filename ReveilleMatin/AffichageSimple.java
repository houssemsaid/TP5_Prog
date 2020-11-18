package com.company.ReveilleMatin;

public class AffichageSimple implements AffichageHeure {

    private HorlogeReveil horlogeReveil;

    public AffichageSimple(HorlogeReveil horlogeReveil){
        this.horlogeReveil = horlogeReveil;
    }

    public void miseAJour(HorlogeReveil h){
        System.out.println(horlogeReveil.getHeures() + ":" + horlogeReveil.getMinutes());
    }

}
