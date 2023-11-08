package com.demo;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.LinkedHashMap;

@Named
@SessionScoped
public class ListeDeroulanteDemoBean implements Serializable {
    private String selectedOption;       // l'option sélectionnée par l'utilisateur
    private LinkedHashMap<String, String> options; // les options pour le menu déroulant

    public ListeDeroulanteDemoBean() {
        options = new LinkedHashMap<>();
        options.put("Option 0", "0");
        options.put("Option 1", "1");
        options.put("Option 2", "2");
        options.put("Option 3", "3");
    }

    public void submit() {
        System.out.println("Option sélectionnée : " + selectedOption);
    }

    public String getSelectedOption() {
        return selectedOption;
    }
    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }
    public LinkedHashMap<String, String> getOptions() {
        return options;
    }
    public void setOptions(LinkedHashMap<String, String> options) {
        this.options = options;
    }
}