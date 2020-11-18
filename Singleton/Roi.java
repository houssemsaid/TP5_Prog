package com.company.Singleton;

public class Roi {

    private static Roi INSTANCE;
    private static String KingName;

    private Roi(String KingName){
        Roi.KingName = KingName;
    }

    public static void newInstance(String KingName){
        Roi.INSTANCE = new Roi(KingName);
    }

    public static Roi getInstance(){ return INSTANCE;}

    public String getNomDuRoi(){return KingName;}
}
