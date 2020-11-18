package com.company.LecteurDeMails;

public class Main {

    public static void main(String[] args){
        Mail mail1 = new Mail("Houssem","Thomas","exercice 5 TP 5","It's the first mail");
        MailEnrichi mail2 = new MailEnrichi("Houssem","Yann","I'm a random subject","It's the second mail");
        mail2.attache(new FichierMail("This is a file","file name"));
        BoiteMailTableau b = new BoiteMailTableau("Charles@gmail.com");
        b.recoit(mail1);
        b = new Notification(b);
        b.recoit(mail2);

    }

}
