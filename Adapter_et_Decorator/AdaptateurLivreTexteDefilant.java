package com.company.Adpter_et_Decorator;

import java.util.List;

public class AdaptateurLivreTexteDefilant implements TexteDefilant {

    private Livre livre;
    private int ligneActuel = 0;
    private int pageActuel = 0;

    public AdaptateurLivreTexteDefilant(String titre, List<Page> livre){
        this.livre = new Livre(titre,livre);
    }

    public void ligneSuivante(){
        if(pageActuel != (livre.getLivre().size())) {
            livre.afficheLigne(pageActuel, ligneActuel);
            incrementerLigneActuel();
        }
    }

    public void ecranSuivant(){
        for(int index = 0; index < 50; index ++){
            ligneSuivante();
        }
    }

    public void incrementerLigneActuel(){
        if(ligneActuel == (livre.getPages(pageActuel).nombreLignes() - 1)){
            ligneActuel = 0;
            incrementerPageActuel();
        }
        else{
            ligneActuel ++;
        }
    }

    public void incrementerPageActuel(){
        if(pageActuel != (livre.getLivre().size())){
            pageActuel ++;
        }
    }
}
