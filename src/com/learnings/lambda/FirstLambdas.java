package com.learnings.lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FirstLambdas {

    public static void main(String[] args) {

        //Supplier example
        Supplier<String> supplier = () -> {
            System.out.println("inside the supplier!");
            return "Hello Suprasanna!!!";
        };
        String welcome = supplier.get();
        System.out.println(welcome);

        //Consumer example
        Consumer<String> consumer = (String s) -> {
            System.out.println("I am inside the consumer");
            System.out.println(s);
        };

        consumer.accept("Hello Supra!!!");


    }

}
