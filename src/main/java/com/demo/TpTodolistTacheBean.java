package com.demo;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.util.ArrayList;

@Named("nouvelleTache")
@RequestScoped
public class TpTodolistTacheBean {

    private String tache;

    public String getTache() {
        return tache;
    }

    public void setTache(String tache) {
        this.tache = tache;
    }
}
