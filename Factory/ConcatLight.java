package com.company.Factory;

public class ConcatLight implements ExpregBinaire {

    private Expreg expression1;
    private Expreg expression2;

    public ConcatLight(Expreg expression1, Expreg expression2){
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    public String toString(){
        return expression1+""+expression2;
    }
}
