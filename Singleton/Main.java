package com.company.Singleton;

public class Main {

    public static void main(String[] args){
        Roi.newInstance("Arthur");
        Roi roi1 = Roi.getInstance();
        System.out.println(roi1.getNomDuRoi());

        System.out.println();

        Roi.newInstance("Louis XIV");
        Roi roi2 = Roi.getInstance();
        System.out.println(roi1.getNomDuRoi());
        System.out.println(roi2.getNomDuRoi());
    }
}
