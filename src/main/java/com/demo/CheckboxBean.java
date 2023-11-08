package com.demo;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class CheckboxBean implements Serializable {
    private List<String> selectedOptions; // Les options sélectionnées par l'utilisateur
    private List<String> options;         // Les options pour les cases à cocher

    public CheckboxBean() {
        options = new ArrayList<>();
        options.add("Option 1");
        options.add("Option 2");
        options.add("Option 3");

        selectedOptions = new ArrayList<>();
    }

    public void submit() {
        System.out.println("Options sélectionnées : " + selectedOptions);
    }

    public List<String> getSelectedOptions() {
        return selectedOptions;
    }
    public void setSelectedOptions(List<String> selectedOptions) {
        this.selectedOptions = selectedOptions;
    }
    public List<String> getOptions() {
        return options;
    }
    public void setOptions(List<String> options) {
        this.options = options;
    }
}