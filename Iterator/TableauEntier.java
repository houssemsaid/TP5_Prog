package com.company.Iterator;

public class TableauEntier extends Tableau{

    public TableauEntier(Object[] tabOfObject){
        super(tabOfObject);
    }

    public boolean sup(Object obj1,Object obj2){
        return ((int)obj1 >= (int)obj2);
    }

}
