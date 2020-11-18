package com.company.ReveilleMatin;

public class AffichageClignotant implements AffichageHeure {

    private HorlogeReveil horlogeReveil;
    private boolean clignote = false;

    public AffichageClignotant(HorlogeReveil horlogeReveil){
        this.horlogeReveil = horlogeReveil;
    }

    public void miseAJour(HorlogeReveil h){
        if(clignote) {
            System.out.println(horlogeReveil.getHeures() + " " + horlogeReveil.getMinutes());
            clignote = false;
        }
        else{
            System.out.println(horlogeReveil.getHeures() + ":" + horlogeReveil.getMinutes());
            clignote = true;
        }
    }

}
