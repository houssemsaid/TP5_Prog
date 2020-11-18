package com.company.ReveilleMatin;

public class Main {

    public static void main(String[] args){
        HorlogeReveil horloge = new HorlogeReveil();
        Sieste s = new Sieste(horloge);
        AffichageHeure aff = new AffichageSimple(horloge);
        AffichageClignotant display = new AffichageClignotant(horloge);

        horloge.regleHeure(10,0,58);
        horloge.ajouteObservateur(display);
        horloge.getReveil().regleReveil(10,1,0);
        horloge.getReveil().setReveil(true);
        horloge.getReveil().setSonReveil(new SonReveilBuzzer());
        horloge.getReveil().sonOn();
        for(int i = 0; i<10; i++) {
            horloge.tictac();
        }

    }
}
