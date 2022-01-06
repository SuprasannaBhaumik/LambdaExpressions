package com.learnings.lambda.model;

import lombok.Data;
import lombok.NoArgsConstructor;

public class Employee {

    private int id;
    private String name;
    private String panCard;

    public Employee(int i, String s, String s1) {
        this.id = i;
        this.name = s;
        this.panCard = s1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }
}
