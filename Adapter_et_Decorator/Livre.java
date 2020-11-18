package com.company.Adpter_et_Decorator;

import java.util.List;

public class Livre{

    private String titre;
    private List<Page> livre;
    private Decorateur decorateur;

    public Livre(String titre, List<Page> livre){
        this.titre = titre;
        this.livre = livre;
    }

    public void afficheLigne(int page, int ligne){
        System.out.println(livre.get(page).getLine(ligne));
    }

    public void affichePage(int page){
        for(int index = 0; index < livre.get(page).nombreLignes(); index ++) {
            System.out.println(livre.get(page).getLine(index));
        }

    }

    public Page getPages(int i){
        return livre.get(i);
    }

    public String getTitre(){
        return titre;
    }

    public List<Page> getLivre(){
        return livre;
    }
}
