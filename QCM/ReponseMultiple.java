package com.company.QCM;

import java.util.List;

public class ReponseMultiple extends Question {

    private List<Integer> bonChoix;

    public ReponseMultiple(String question, String [] reponses, List<Integer> bonChoix){
        super(question, reponses,bonChoix);
        this.bonChoix = bonChoix;
    }

    public boolean bienChoisi() {
        for(int i = 0; i < nbChoix(); i++) {
            if (estCoche(i) && bonChoix.get(i) == i || estCoche(i) && bonChoix.get(i) != i) {
                return false;
            }
        }
        return true;
    }
}
