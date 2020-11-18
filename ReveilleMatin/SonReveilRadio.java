package com.company.ReveilleMatin;

public class SonReveilRadio implements SonReveil{

    private Radio radio;

    public SonReveilRadio(){
        radio = new Radio();
    }

    public void on(){
        radio.allume();
    }

    public void off(){
        radio.eteint();
    }

}
