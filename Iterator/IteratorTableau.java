package com.company.Iterator;

public class IteratorTableau extends Iterator {

    private Object[] tabOfObject;
    private int position;

    public IteratorTableau(Object[] tabOfObject){
        this.tabOfObject = tabOfObject;
    }

    public  void init(){
        position = 0;
    }

    public  Object suivant(){
        position++;
        return tabOfObject[position];
    }

    public  boolean fini(){
        if(position == (tabOfObject.length - 1)){
            return true;
        }
        return false;
    }

    public  Object courant(){
        return tabOfObject[position];
    }

}
