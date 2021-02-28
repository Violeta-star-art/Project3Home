package com.company.test;

public class Main {
    public static void main(String[] args) {

        int price = 500;
        int discountPercentage = 5;
        float productPriceAfterDiscount = price - price * (discountPercentage / 100.0f);
        System.out.println(productPriceAfterDiscount);
        System.out.println("Hello");
    }
}

