package com.demo;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
//@RequestScoped
@SessionScoped
public class MonStateBean implements Serializable {

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void changeValue() {
        count++;
    }
}