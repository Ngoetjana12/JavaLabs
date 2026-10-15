package org.example;

public class Product {

    String product;
    String name;
    double price;
    int quantity;

    Product(String productID, String productName, double productPrice, int productQuantity){

        product = productID;
        name = productName;
        price = productPrice;
        quantity = productQuantity;
    }

    void displayDetails(){

        System.out.println("Product ID:" + product);
        System.out.println("Product Name:" + name);
        System.out.println("Product Price:R" + price);
        System.out.println("Product Quantity:" + quantity);

    }

    void addStock(){

        quantity++;
    }

    void reduceStock(){

        if(quantity <= 0){
            System.out.println("Stock no longer available");
        }else{
            quantity--;
        }

    }

    void calculateValue(){

        double cost = price * quantity;
        System.out.println("The total cost of the available stock is R:" + cost);
    }
}
