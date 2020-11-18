package com.company.QCM;

import java.util.ArrayList;
import java.util.List;

public abstract class Question {

    private String question;
    private String [] reponses;
    private boolean [] coches;
    private List<Integer> bonChoix;

    public Question(String question, String [] reponses, List<Integer> bonChoix) {
        this.question = question;
        this.reponses = reponses;
        this.bonChoix = bonChoix;
        coches = new boolean[reponses.length];
    }

    public Question(String question, String [] reponses, int bonChoix) {
        this.question = question;
        this.reponses = reponses;
        this.bonChoix = new ArrayList<>();
        this.bonChoix.add(bonChoix);
        coches = new boolean[reponses.length];
    }

    public abstract boolean bienChoisi();

    public void coche(int i) {
        coches[i] = true;
    }

    public boolean estCoche(int i) {
        return coches[i];
    }

    public boolean nonTraitee() {
        for(int i = 0; i < coches.length; i++)
            if(coches[i])
                return false;
        return true;
    }

    public int nbChoix(){
        return bonChoix.size();
    }

}
