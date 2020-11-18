package com.company.ServiceEnseignement;

public class ServiceMoniteur extends Service {


    private Service service;

    public ServiceMoniteur(){
        super(64,new HeuresTPNonPermanent());
    }

}
