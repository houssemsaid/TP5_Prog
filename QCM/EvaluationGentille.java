package com.company.QCM;

public class EvaluationGentille implements EvaluationQuestion {

    public int evalue(Question question){
        if (question.nonTraitee())
            return 0;
        else if (question.bienChoisi())
            return 1;
        else return 0;
    }

}
