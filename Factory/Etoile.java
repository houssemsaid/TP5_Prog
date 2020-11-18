package com.company.Factory;

public class Etoile implements ExpregBase {

    private Expreg expression;

    public Etoile(Expreg expression){
        this.expression = expression;
    }

    public String toString(){
        return "("+expression.toString()+")*";
    }
}
