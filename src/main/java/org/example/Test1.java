package org.example;

public class Test1 {
        public static void main(String[] args) {
        Main main =  new Main();
        System.out.println(main.calculatePrice(-999));
        System.out.println(main.calculatePrice(100000));
        System.out.println(main.calculatePrice(500000));
        System.out.println(main.calculatePrice(2000000));
        System.out.println(main.calculatePrice(7000000));
        System.out.println(main.calculatePrice(99999999));

    }
}
