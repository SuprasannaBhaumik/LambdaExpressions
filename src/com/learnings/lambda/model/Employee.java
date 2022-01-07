package com.learnings.lambda.model;

public class Employee {

    private int id;
    private String name;
    private String panCard;

    public Employee(int id, String name, String panCard) {
        this.id = id;
        this.name = name;
        this.panCard = panCard;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", panCard='" + panCard + '\'' +
                '}';
    }
}
