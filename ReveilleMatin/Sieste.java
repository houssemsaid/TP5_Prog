package com.company.ReveilleMatin;

public class Sieste {

    private HorlogeReveil horlogeReveil;
    private boolean sieste = false;
    private int heureFinSieste;
    private int minuteFinSieste;

    public Sieste(HorlogeReveil horlogeReveil){
        this.horlogeReveil = horlogeReveil;
    }

    public void sleep(int m) {
        sieste = true;
        minuteFinSieste = (horlogeReveil.getMinutes() + m) % 60;
        heureFinSieste = (horlogeReveil.getHeures() + m / 60) % 24;
    }

    public void snooze() {
        horlogeReveil.getReveil().sonOff();
        sleep(9);
    }

}
