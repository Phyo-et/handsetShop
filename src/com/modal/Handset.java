package com.modal;

public class Handset {
    private int modelNo;
    private double price;
    private int instock;
    private String brand;


    public Handset(int modelNo, double price, int instock, String brand) {
        this.modelNo = modelNo;
        this.price = price;
        this.instock = instock;
        this.brand = brand;
    }

    public int getModelNo() {
        return modelNo;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInstock() {
        return instock;
    }

    public void setInstock(int instock) {
        this.instock = instock;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Handset{" +
                "modelNo=" + modelNo +
                ", price=" + price +
                ", instock=" + instock +
                ", brand='" + brand + '\'' +
                '}';
    }

}
