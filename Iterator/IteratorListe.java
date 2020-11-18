package com.company.Iterator;

import java.util.LinkedList;

public class IteratorListe extends Iterator {

    private LinkedList<Object> tabOfObject;
    private int position;

    public IteratorListe(LinkedList<Object> tabOfObject){
        this.tabOfObject = tabOfObject;
    }

    public  void init(){
        position = 0;
    }

    public  Object suivant(){
        position++;
        return tabOfObject.get(position);
    }

    public  boolean fini(){
        if(position == (tabOfObject.size() - 1)){
            return true;
        }
        return false;
    }

    public  Object courant(){
        return tabOfObject.get(position);
    }

}
