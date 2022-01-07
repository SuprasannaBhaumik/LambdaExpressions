package com.learnings.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FirstLambdas {

    public static void main(String[] args) {

        //Supplier example, takes nothing returns object
        Supplier<String> supplier = () -> {
            System.out.println("inside the supplier!");
            return "Hello Suprasanna!!!";
        };
        String welcome = supplier.get();
        System.out.println(welcome);

        System.out.println("----------------------------");

        //Consumer example, takes input returns nothing
        Consumer<String> consumer = (String s) -> {
            System.out.println("I am inside the consumer");
            System.out.println(s);
        };
        consumer.accept("Hello Supra!!!");

        System.out.println("----------------------------");

        //Predicate example, takes input returns boolean
        Predicate<Integer> predicate = (Integer i) -> {
            System.out.println("I am inside the predicate that returns boolean, used for filter operations");
            return i > 0;
        };
        boolean flag = predicate.test(4);
        System.out.println("predicate.test(4) -> " + flag);

        System.out.println("----------------------------");

        //Function example, takes something returns something
        Function<Integer, String> function = (Integer x) -> {
            System.out.println("I am inside the function that takes some input, performs operations and returns output, used for map operations");
            return x.toString();
        };
        String result = function.apply(4);
        System.out.println("function.apply(4) -> " + result);

        System.out.println("----------------------------");

        //Runnable
        Runnable r = () -> System.out.println("inside the runnable interface");
        r.run();
        System.out.println("----------------------------");

    }

}
