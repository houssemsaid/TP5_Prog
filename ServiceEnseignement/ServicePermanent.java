package com.company.ServiceEnseignement;

public class ServicePermanent extends Service{

    public ServicePermanent(){
        super(192,new HeuresTPPermanent());
    }

    public int nbHeuresSup(){
        int heuresSup = (int)(1.5 * getHeuresCours().getQte() + getHeuresTD().getQte() + getHeuresTP().getQte()) - getHeuresDues();
        if(heuresSup > 0){
            return heuresSup;
        }
        return 0;
    }

}
