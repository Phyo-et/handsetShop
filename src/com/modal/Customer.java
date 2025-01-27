package com.modal;

public class Customer {
    private int memberId;
    private String name;


    public Customer(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                '}';
    }
}
