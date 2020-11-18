package com.company.Iterator;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args){
        Object[] tab = new Object[6];
        tab[0] = 1;
        tab[1] = 25;
        tab[2] = 8;
        tab[3] = 89;
        tab[4] = 4;
        tab[5] = 5;

        TableauEntier tableauEntier = new TableauEntier(tab);
        System.out.println("TableauEntier max value is "+tableauEntier.maximum());

        SecondTableauEntier secondTableauEntier = new SecondTableauEntier(tab);
        System.out.println("SecondTableauEntier max value is "+secondTableauEntier.maximum());

        LinkedList<Object> listOfObject = new LinkedList<>();
        listOfObject.add(1);
        listOfObject.add(5);
        listOfObject.add(3);
        listOfObject.add(100);
        listOfObject.add(4);
        listOfObject.add(20);

        ListeEntier listeEntier = new ListeEntier(listOfObject);
        System.out.println("ListeEntier max value is "+listeEntier.maximum());
    }
}
