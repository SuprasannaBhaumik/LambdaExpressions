package com.learnings.lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ChainingLambda {

    public static void main(String[] args) {

        //isNull: returns boolean, takes an single input
        Predicate<String> isNull = s -> s == null;

        //isEmpty
        Predicate<String> isEmpty = s -> s.isEmpty();

        //combine the predicates
        Predicate<String>  stringCheck = isNull.negate().and(isEmpty.negate());

        //test the string
        System.out.println("stringCheck.test(null) -> " + stringCheck.test(null));
        System.out.println("stringCheck.test(\"\") -> " + stringCheck.test(""));
        System.out.println("stringCheck.test(\"Suprasanna\") -> " + stringCheck.test("Suprasanna"));

        System.out.println("------------------------------------------");

        //chain consumers, takes input, returns nothing
        Consumer<Integer> c1 = i -> System.out.println(i);
        Consumer<Integer> c2 = i -> System.out.println(i);
        Consumer<Integer> c3 = c1.andThen(c2);
        c3.accept(5);

        System.out.println("------------------------------------------");
    }

}
