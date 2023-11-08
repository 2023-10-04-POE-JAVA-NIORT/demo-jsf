package com.demo;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.ArrayList;

@Named("personsBean")
@RequestScoped
public class DataTableDemoBean {

    private ArrayList<Person> persons = new ArrayList<>();

    public DataTableDemoBean(){
        persons.add(new Person("Alain", "Delon", "alain@delon.fr"));
        persons.add(new Person("Marie", "Dufour", "marie@dufour.fr"));
    }


    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
}
