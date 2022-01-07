package com.learnings.lambda;

public class MyPredicateTest {

    public static void main(String[] args) {

        MyPredicate<String> LT20 = s -> s.length() < 20;
        MyPredicate<String> MT5 = s -> s.length() > 5;

        MyPredicate<String> stringCheck = LT20.and(MT5);

        System.out.println(stringCheck.test("Suprasanna Bhaumik !!!"));

    }
}
