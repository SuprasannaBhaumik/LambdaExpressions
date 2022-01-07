package com.learnings.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaUsage {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(List.of(1, 12, 76, 75, 45, 73, 89, 15));

        //predicate to filter out numbers divisible by 5
        Predicate<Integer> notDivisibleByFive = number -> number % 5 != 0;
        myList.removeIf(notDivisibleByFive);

        //consumer to display the numbers
        Consumer<Integer> numberDisplayConsumber = x -> {
            System.out.println(x);
        };

        myList.forEach(System.out::println);

    }
}
