package com.company.Adpter_et_Decorator;

import java.util.List;

public class DecorateurEntete extends Livre {

    public DecorateurEntete(String titre, List<Page> livre){
        super(titre,livre);
    }

    public void affichePage(int page){
        System.out.println("Titre : "+getTitre());
        System.out.println();
        super.affichePage(page);
    }
}
