package com.company.ReveilleMatin;

public class SonReveilBuzzer implements SonReveil{

    private Buzzer buzzer;

    public SonReveilBuzzer(){
        buzzer = new Buzzer();
    }

    public void on(){
        buzzer.demarre();
    }

    public void off(){
        buzzer.stoppe();
    }

}
