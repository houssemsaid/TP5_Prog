package com.company.Iterator;

public abstract class Tableau {

    private Object[] tabOfObject;

    public Tableau(Object[] tabOfObject){
        this.tabOfObject = tabOfObject;
    }

    abstract public boolean sup(Object x, Object y);

    public Object maximum(){
        Object maximum = tabOfObject[0];

        for(int index = 0; index < tabOfObject.length; index++){
            if(sup(tabOfObject[index],maximum)){
                maximum = tabOfObject[index];
            }
        }
        return maximum;
    }

}
