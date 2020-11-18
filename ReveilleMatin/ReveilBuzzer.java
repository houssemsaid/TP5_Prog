package com.company.ReveilleMatin;

public class ReveilBuzzer implements ModeReveil {

    private static ModeReveil INSTANCE;

    public static ModeReveil getInstance(){
        if(ReveilBuzzer.INSTANCE == null){
            ReveilBuzzer.INSTANCE = new ReveilBuzzer();
        }
        return INSTANCE;
    }


    public ModeReveil next(Reveil reveil){
        return ReveilRadio.getInstance();
    }

}
