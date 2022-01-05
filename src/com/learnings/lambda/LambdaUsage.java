package com.learnings.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaUsage {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(List.of(1, 12, 76, 75, 45, 73, 89, 15));

        //predicate to filter out numbers divisible by 5
        Predicate<Integer> divisibleByFive = number -> number % 5 != 0;

        myList.removeIf(divisibleByFive);



        //consumer to display the numbers
        Consumer<Integer> numberDisplayConsumber = x -> {
            System.out.println(x);
        };

        myList.forEach(numberDisplayConsumber);

    }
}
