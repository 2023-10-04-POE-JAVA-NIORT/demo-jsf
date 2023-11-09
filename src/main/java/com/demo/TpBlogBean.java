package com.demo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.ArrayList;

@Named("blog")
@ApplicationScoped
public class TpBlogBean {

    private ArrayList<TpBlogMessage> messages;
    private int idCount = 0;

    public TpBlogBean() {
        messages = new ArrayList<>();
        addMessage("titre 1", "Message 1");
        addMessage("titre 2", "Message 2");
        addMessage("titre 3", "Message 3");
    }

    public void addMessage(String titre, String contenu){
        idCount++;
        messages.add(new TpBlogMessage(idCount, titre, contenu));
    }

    public ArrayList<TpBlogMessage> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<TpBlogMessage> messages) {
        this.messages = messages;
    }

    public int getIdCount() {
        return idCount;
    }

    public void setIdCount(int idCount) {
        this.idCount = idCount;
    }

    public TpBlogMessage getMessageById(int id){
        for(TpBlogMessage message : messages){
            if(message.getId() == id)
                return message;
        }
        return null;
    }
}
