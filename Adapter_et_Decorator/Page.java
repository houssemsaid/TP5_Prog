package com.company.Adpter_et_Decorator;


import java.util.ArrayList;
import java.util.List;

public class Page {

    private List<String> page;

    public Page(){
        page = new ArrayList<>();
    }

    public String getLine(int i){
        return page.get(i);
    }

    public void addLine(String line){
        page.add(line);
    }

    public int nombreLignes(){
        return page.size();
    }
}
