package org.example;

public class Main {
    public static final int MAXIMUM_PRICE = 10000000;
    public static int calculatePrice(int originalPrice) {
        if (originalPrice <= 0 || originalPrice > MAXIMUM_PRICE) {
            System.out.println("Price is invalid");
            return -1;
        }
        double discountRate;
        if (originalPrice < 200000) discountRate = 0;
        else if (originalPrice < 1000000) discountRate = 0.05;
        else if (originalPrice < 5000000) discountRate = 0.1;
        else discountRate = 0.15;

        return (int) (originalPrice - (int)originalPrice * discountRate);
    }

    public static void main(String[] args) {
        System.out.println(calculatePrice(15000));
    }
}