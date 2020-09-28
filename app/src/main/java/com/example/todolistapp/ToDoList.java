package com.example.todolistapp;

public class ToDoList {
    private String titledoes, descdoes, prioritydoes;

    public ToDoList() {
    }

    public ToDoList(String titledoes, String descdoes, String prioritydoes) {
        this.titledoes = titledoes;
        this.descdoes = descdoes;
        this.prioritydoes = prioritydoes;
    }

    public String getTitledoes() {
        return titledoes;
    }

    public void setTitledoes(String titledoes) {
        this.titledoes = titledoes;
    }

    public String getDescdoes() {
        return descdoes;
    }

    public void setDescdoes(String descdoes) {
        this.descdoes = descdoes;
    }

    public String getPrioritydoes() {
        return prioritydoes;
    }

    public void setPrioritydoes(String prioritydoes) {
        this.prioritydoes = prioritydoes;
    }
}
