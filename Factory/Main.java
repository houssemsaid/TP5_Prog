package com.company.Factory;

public class Main {

    public static void main(String[] args){
        Symbole a = new Symbole('a');
        Etoile star = new Etoile(a);
        Etoile star2 = new Etoile(star);
        System.out.println(star.toString());
        System.out.println(star2.toString());

        System.out.println("----------------------------------------------------------");

        Concat c = new Concat(new Symbole('a'),new Symbole('b'));
        Etoile star3 = new Etoile(new Somme(new Epsilon(),c));
        System.out.println(star3.toString());

        System.out.println("----------------------------------------------------------");

        Epsilon e = (Epsilon)ChaineFactory.creeChaine("");
        Symbole s = (Symbole)ChaineFactory.creeChaine("s");
        Concat azer = (Concat)ChaineFactory.creeChaine("azer");
        System.out.println(e.toString());
        System.out.println(s.toString());
        System.out.println(azer.toString());

        System.out.println("----------------------------------------------------------");

        Symbole a3 = new Symbole('a');
        ConcatLight c1 = new ConcatLight(a3, new Somme(a3,new ConcatLight(a3, a3)));
        System.out.println(c1.toString());



    }

}
