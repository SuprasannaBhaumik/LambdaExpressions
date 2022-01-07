package com.learnings.lambda.collections;

import com.learnings.lambda.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class NewCollectionsFramework {


    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Terminator", "JAMES");
        Employee e2  = new Employee(2, "Rocky", "SYLVESTER");
        Employee e3  = new Employee(3, "Matrix", "WACHOWSKI");
        Employee e4  = new Employee(4, "Mission Impossible", "JOHN");
        Employee e5  = new Employee(5, "Avatar", "JAMES");
        Employee e6  = new Employee(6, "Die Hard", "NA");

        List<Employee> employeeList = new ArrayList(Arrays.asList(e1, e2, e3, e4, e5, e6));

        Predicate<Employee> jamesMovies = e -> e.getPanCard().equals("JAMES");
        employeeList.removeIf(jamesMovies);

        UnaryOperator<Employee> addSequelNo = e -> {
            e.setName(e.getName() + "-" + (int)(Math.random()*10));
            return e;
        };
        employeeList.replaceAll(addSequelNo);

        Function<Employee, Integer> idExtractorFunction = Employee::getId;
        Comparator<Employee> idComparator =
                Comparator.comparingInt(idExtractorFunction::apply);
        employeeList.sort(idComparator.reversed());

        employeeList.forEach(System.out::println);

    }
}
