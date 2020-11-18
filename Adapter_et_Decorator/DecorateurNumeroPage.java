package com.company.Adpter_et_Decorator;

import java.util.List;

public class DecorateurNumeroPage extends Livre {

    public DecorateurNumeroPage(String titre, List<Page> livre){
        super(titre,livre);
    }

    public void affichePage(int page){
        super.affichePage(page);
        System.out.println();
        System.out.println("Page "+(page + 1));
    }
}
