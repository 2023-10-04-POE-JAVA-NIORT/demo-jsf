package com.demo;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class TextareaBean {

    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String submit() {
        System.out.println("Commentaire reçu: " + comment);
        return "textareaDemo2.xhtml"; // Naviguer vers une autre page si nécessaire
    }
}