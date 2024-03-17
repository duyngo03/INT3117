package org.example;

public class Test2 {
    public static void main(String[] args) {
        Main main =  new Main();
        System.out.println(main.calculatePrice(0));
        System.out.println(main.calculatePrice(1000));
        System.out.println(main.calculatePrice(5000000));
        System.out.println(main.calculatePrice(10000000));
        System.out.println(main.calculatePrice(9999000));
    }
}
