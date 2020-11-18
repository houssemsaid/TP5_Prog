package com.company.LecteurDeMails;

public class LecteurMailAttache extends LecteurMail {

    public LecteurMailAttache(String expediteur){
        super(expediteur);
    }

    public void traiteAttachement(){
        if(getCourant() instanceof MailEnrichi && ((MailEnrichi)getCourant()).recupere() != null){
            ((MailEnrichi)getCourant()).recupere().execute();
        }
    }

    public void transfereEnAttache(String destinataire){
        Fichier fichier = new FichierMail(getCourant().getContenu(),getCourant().getAuteur());
        MailEnrichi mail = new MailEnrichi(getCourant().getAuteur(),destinataire,getCourant().getSujet(),"");
        mail.attache(fichier);
        getServeur().envoie(mail);
    }

}
