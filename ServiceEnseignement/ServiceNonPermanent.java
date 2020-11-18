package com.company.ServiceEnseignement;

public class ServiceNonPermanent extends Service {

    private Service service;

    public ServiceNonPermanent(int heuresDues){
        super(heuresDues,new HeuresTPNonPermanent());
    }

}
