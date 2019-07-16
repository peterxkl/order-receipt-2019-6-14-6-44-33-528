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

        final double taxRate = .10;
        final double totalSalesTax = getTotalSalesTax(taxRate, order);
        final double total = order.getLineItems().stream().mapToDouble(x->x.totalAmount()).sum()+totalSalesTax;
        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.getDescription());
            output.append('\t');
            output.append(lineItem.getPrice());
            output.append('\t');
            output.append(lineItem.getQuantity());
            output.append('\t');
            output.append(lineItem.totalAmount());
            output.append('\n');
        }
        output.append("Sales Tax").append('\t').append(totalSalesTax);
        output.append("Total Amount").append('\t').append(total);
        
        return output.toString();
    }

    private static double getTotalSalesTax(double taxRate, Order order) {
        return order.getLineItems().stream().mapToDouble(x->x.totalAmount()*taxRate).sum();
    }

    private void printOrders(StringBuilder output) {
        output.append("======Printing Orders======\n");
        output.append(order.getName());
        output.append(order.getAddress());
    }
}