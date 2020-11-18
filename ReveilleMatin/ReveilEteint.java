package com.company.ReveilleMatin;

public class ReveilEteint implements ModeReveil {

    private static ModeReveil INSTANCE;

    public static ModeReveil getInstance(){
        if(ReveilEteint.INSTANCE == null){
            ReveilEteint.INSTANCE = new ReveilEteint();
        }
        return INSTANCE;
    }

    public ModeReveil next(Reveil reveil){
        return ReveilBuzzer.getInstance();
    }

}
