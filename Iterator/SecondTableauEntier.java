package com.company.Iterator;

public class SecondTableauEntier extends Agregat {

    private Object[] tabOfObject;

    public SecondTableauEntier(Object[] tabOfObject){
        this.tabOfObject = tabOfObject;
    }

    public boolean sup(Object x,Object y){
        return ((int)x >= (int)y);
    }

    protected Iterator getIterator(){
        return new IteratorTableau(tabOfObject);
    }

}
