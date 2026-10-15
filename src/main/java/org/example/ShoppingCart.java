package org.example;

public class ShoppingCart {

    String product;
    double price;
    int quantity;

    public ShoppingCart(String product, double price, int quantity){
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateAmt(double price, int quantity){

        double total = price * quantity;
        double discounted = total - (total*0.25);

        return discounted;
    };

    public void displaySummary(double total, int discounted){

        System.out.println("Item:" + product);
        System.out.println("Total R:" + total);
        System.out.println("Total R:" + discounted);
    }

}

