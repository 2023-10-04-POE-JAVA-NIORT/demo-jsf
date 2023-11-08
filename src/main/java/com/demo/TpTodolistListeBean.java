package com.demo;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;

@Named("listeTaches")
@SessionScoped
public class TpTodolistListeBean implements Serializable {

    private ArrayList<String> taches = new ArrayList<>();

    public void enregistrerNouvelleTache(String nouvelleTache){
        taches.add(nouvelleTache);
    }

    public ArrayList<String> getTaches() {
        return taches;
    }

    public void setTaches(ArrayList<String> taches) {
        this.taches = taches;
    }
}
