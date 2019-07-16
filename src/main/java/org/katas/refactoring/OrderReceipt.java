package org.katas.refactoring;


public class OrderReceipt {
    private Order order;
    double totalSalesTax = 0d;
    double total = 0d;
    double salesTax = 0d;
    StringBuilder output = new StringBuilder();

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {

        printOrders(output);

        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.getDescription());
            output.append('\t');
            output.append(lineItem.getPrice());
            output.append('\t');
            output.append(lineItem.getQuantity());
            output.append('\t');
            output.append(lineItem.totalAmount());
            output.append('\n');
            
            salesTax = lineItem.totalAmount() * .10;
            totalSalesTax += salesTax;
            total += lineItem.totalAmount() + salesTax;
        }
        output.append("Sales Tax").append('\t').append(totalSalesTax);
        output.append("Total Amount").append('\t').append(total);
        
        return output.toString();
    }

    private void printOrders(StringBuilder output) {
        output.append("======Printing Orders======\n");
        output.append(order.getName());
        output.append(order.getAddress());
    }
}