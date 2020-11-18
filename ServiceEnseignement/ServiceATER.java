package com.company.ServiceEnseignement;

public class ServiceATER extends Service {

    private Service service;

    public ServiceATER(){
        super(192,new HeuresTPNonPermanent());
    }

}
