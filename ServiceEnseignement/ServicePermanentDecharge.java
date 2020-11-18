package com.company.ServiceEnseignement;

public class ServicePermanentDecharge extends Service {

    public ServicePermanentDecharge(int heuresDecharge){
        super(192 - heuresDecharge,new HeuresTPPermanent());
    }

}
