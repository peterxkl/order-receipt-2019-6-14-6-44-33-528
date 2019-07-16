package org.katas.refactoring;

import java.util.List;

public class Order {
    String name;
    String address;
    List<LineItem> lineItems;

    public Order(String name, String address, List<LineItem> lineItems) {
        this.name = name;
        this.address = address;
        this.lineItems = lineItems;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }
}
