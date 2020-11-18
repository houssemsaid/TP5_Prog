package com.company.Adpter_et_Decorator;

import java.util.List;

public class Decorateur extends Livre{

    protected Livre livre;

    public Decorateur(String titre, List<Page> livre){
        super(titre,livre);
    }

    public  void affichePage(int page){
        System.out.println("Titre : "+getTitre());
        System.out.println();
        super.affichePage(page);
        System.out.println();
        System.out.println("Page "+(page + 1));
    }

}