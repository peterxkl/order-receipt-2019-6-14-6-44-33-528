//package org.katas.refactoring;

public class LineItem {
    private String description;
    private double price;
    private int count;

    public LineItem(String description, double price, int count) {
        this.description = description;
        this.price = price;
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    double totalAmount() {
        return price*count;
    }
}