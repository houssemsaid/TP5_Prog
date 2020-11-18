package com.company.QCM;

public class QCM {

    private Question[] questions;
    private EvaluationQuestion evaluationQuestion;

    public QCM(Question[] questions) {
        this.questions = questions;
    }

    public void coche(int question, int choix) {
        questions[question].coche(choix);
    }

    public int note() {
        int note = 0;
        for (int i = 0; i < questions.length; i++)
            note = note + getEvaluationQuestion().evalue(questions[i]);
        return note;
    }

    public void setEvaluationQuestion(EvaluationQuestion evaluationQuestion){
        this.evaluationQuestion = evaluationQuestion;
    }

    public EvaluationQuestion getEvaluationQuestion(){return evaluationQuestion;}

}
