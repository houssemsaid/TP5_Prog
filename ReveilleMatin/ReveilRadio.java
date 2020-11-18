package com.company.ReveilleMatin;

public class ReveilRadio implements ModeReveil {

    private static ModeReveil INSTANCE;

    public static ModeReveil getInstance(){
        if(ReveilRadio.INSTANCE == null){
            ReveilRadio.INSTANCE = new ReveilRadio();
        }
        return INSTANCE;
    }



    public ModeReveil next(Reveil reveil){
        return ReveilEteint.getInstance();
    }

}
