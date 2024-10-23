package com.modal;

public class Sales {

    private int id;
    private String name;
    private int targetSale;

    public Sales(int id, String name, int targetSale) {
        this.id = id;
        this.name = name;
        this.targetSale = targetSale;
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

    public int getTargetSale() {
        return targetSale;
    }

    public void setTargetSale(int targetSale) {
        this.targetSale = targetSale;
    }
}
