package org.example;

import java.util.ArrayList;

public class ProductClass {

    String name;
    double price;
    int quantity;

    ProductClass(String name, double price, int quantity){

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void calcLine(ArrayList<ProductClass> product){

        double lineTotal = 0;
        double subTotal = 0;

        for(int i=0 ; i<product.size(); i++) {

            lineTotal = product.get(i).price * product.get(i).quantity;
            System.out.println("The total for " + product.get(i).name + " is R" + lineTotal);
            subTotal = subTotal + lineTotal;
            System.out.println("The subtotal now is R" +subTotal);
        }
    }
}
