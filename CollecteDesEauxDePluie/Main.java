package com.company.CollecteDesEauxDePluie;

public class Main {

    public static void main(String[] args){

        Collecteur collector = new Collecteur();
        TuyauSimple pipe = new TuyauSimple();
        TuyauMultiple multiplepipe = new TuyauMultiple(2);
        Citerne citerne1 = new Citerne("C1");
        Citerne citerne2 = new Citerne("C2");

        // pipe.accorde(collector);
        citerne1.raccorde(pipe);
        collector.fournit(15);// affiche:"C1:15" (15 l sont passes de collector a pipe puis de pipe a citerne1)
        citerne1.retire();
        //multiplepipe.raccorde(pipe);
        citerne1.raccorde(multiplepipe);
        citerne2.raccorde(multiplepipe);
        collector.fournit(10);// affiche:"C1:20" et "C2:5" (10 l sont passes de collector a pipe puis de pipe a multiplepipe qui a fourni 5 l a citerne1 et 5 litres a citerne2)

    }

}
