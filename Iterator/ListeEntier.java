package com.company.Iterator;

import java.util.LinkedList;

public class ListeEntier  extends Agregat{

    private LinkedList<Object> listOfObject;

    public ListeEntier(LinkedList<Object> listOfObject){
        this.listOfObject = listOfObject;
    }

    public boolean sup(Object x,Object y){
        return ((int)x >= (int)y);
    }

    protected Iterator getIterator() {
        return new IteratorListe(listOfObject);
    }

}
