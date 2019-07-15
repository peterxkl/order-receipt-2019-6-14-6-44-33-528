//package org.katas.refactoring;

public class LineItem {
    private String description;
    private double price;
    private int quantity;

    public LineItem(String description, double price, int count) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return quantity;
    }

    double totalAmount() {
        return price*quantity;
    }
}