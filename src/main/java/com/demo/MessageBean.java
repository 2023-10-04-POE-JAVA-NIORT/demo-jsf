package com.demo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
//@RequestScoped
//@ApplicationScoped
@SessionScoped
public class MessageBean implements Serializable {

    private int compteur = 0;

    private String message = "Valeur du compteur: ";

    public String getMessage() {
        compteur++;
        return message + compteur;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
