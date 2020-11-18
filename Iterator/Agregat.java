package com.company.Iterator;

public abstract class Agregat {

    public abstract boolean sup(Object x,Object y);
    protected abstract Iterator getIterator();

    public Object maximum(){
        Iterator iterator = getIterator();
        iterator.init();
        Object maximum = iterator.courant();

        while(!iterator.fini()){
            if(sup(iterator.suivant(),maximum)){
                maximum = iterator.courant();
            }
        }
        return maximum;
    }
}
