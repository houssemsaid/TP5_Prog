package com.company.ServiceEnseignement;

public class AjouteControle  implements StrategieAjout{

    public void ajoute(HeuresEnseignement type, int heures, Service s){
        if(type instanceof HeuresTPPermanent){
            s.ajouteHeuresTP(heures);
        }
        if(type instanceof HeuresTPNonPermanent){

        }
    }

}
