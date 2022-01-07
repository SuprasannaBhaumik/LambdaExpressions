package com.learnings.lambda;

import com.learnings.lambda.model.Employee;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference {

    public static void main(String[] args) {

        //function takes person and returns age
        Employee emp1 = new Employee(1, "Suprasanna", "PAN");

        System.out.println("--------------Case 1 : takes 1, returns 1 ---------------------");
        System.out.println("old way");
        Function<Employee, String> oldWay = e1 -> e1.getName();
        String oldName = oldWay.apply(emp1);
        System.out.println(oldName);

        System.out.println("new way - method reference");
        Function<Employee, String> newWay = Employee::getName;
        String newName = newWay.apply(emp1);
        System.out.println(newName);



        System.out.println("--------------Case 2 : takes 1 argument, returns none ---------------------");
        System.out.println("old way");
        Consumer<String> c1 = c -> System.out.println("inside consumer -> " + c);
        c1.accept("Suprasanna!!!");

        System.out.println("new way");
        Consumer<String> c2 = System.out::println;
        c2.accept("Bhaumik!!!");


        System.out.println("--------------Case 3 : takes 2 arguments, return 1 ---------------------");
        BinaryOperator<Integer> bo = (i1, i2) -> Integer.sum(i1, i2);
        System.out.println("old way");
        int oldResult = bo.apply(4,6);
        System.out.println(oldResult);

        BinaryOperator<Integer> boNew = Integer::sum;
        System.out.println("new way");
        int newResult = boNew.apply(8,9);
        System.out.println(newResult);

    }
}
