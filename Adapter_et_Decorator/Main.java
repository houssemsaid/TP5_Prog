package com.company.Adpter_et_Decorator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Page> pages = new ArrayList<>();
        Page page1 = new Page();
        page1.addLine("Welcome");
        page1.addLine("This is the first page");
        Page page2 = new Page();
        page2.addLine("This is page 2");
        pages.add(page1);
        pages.add(page2);

        Livre livre = new Decorateur("Test Book",pages);
        livre.affichePage(0);
        livre.affichePage(1);
    }
}
