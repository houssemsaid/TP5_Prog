package com.company.ReveilleMatin;

public class ReveilMatin {

    private int heures;
    private int minutes;
    private int secondes;
    private int heureReveil;
    private int minuteReveil;
    private boolean reveil = false;
    private int sonReveil = 1;
    private int heureFinSieste;
    private int minuteFinSieste;
    private boolean sieste = false;
    private Radio radio = new Radio();
    private Buzzer buzzer = new Buzzer();

    public void regleHeure(int h, int m, int s) {
        heures = h;
        minutes = m;
        secondes = s;    }

    public void regleReveil(int h, int m){
        heureReveil = h;
        minuteReveil = m;
    }

    public void tictac() {
        secondes = (secondes + 1) % 60;
        if(secondes == 0) {
            minutes = (minutes + 1) % 60;
            if(minutes == 0)
                heures = (heures + 1) % 24;
        }
        System.out.println(heures + ":" + minutes);
        if(reveil && heures == heureReveil && minutes == minuteReveil && secondes == 0)
            sonOn();
        if(sieste && heures == heureFinSieste && minutes == minuteFinSieste){
            sonOn();
            sieste = false;
        }
    }

    public void basculeReveil() {
        if(!reveil) {
            reveil = true;
            sonReveil = 1;
        }
        else if(sonReveil == 1)
            sonReveil = 2;
        else
            reveil = false;
    }

    public void sonOn() {
        if(sonReveil == 1)
            buzzer.demarre();
        else
            radio.allume();
    }

    public void sonOff() {
        if(sonReveil == 1)
            buzzer.stoppe();
        else
            radio.eteint();
    }

    public void sleep(int m) {
        sieste = true;
        minuteFinSieste = (minutes + m) % 60;
        heureFinSieste = (heures + m / 60) % 24;
    }

    public void snooze() {
        sonOff();
        sleep(9);
    }

}
