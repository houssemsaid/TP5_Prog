package com.company.Factory;

public class Concat implements ExpregBinaire {

    private Expreg expression1;
    private Expreg expression2;

    public Concat(Expreg expression1, Expreg expression2){
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    public String toString(){
        return "("+expression1+"."+expression2+")";
    }
}
