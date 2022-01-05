package com.learnings.lambda;

import com.learnings.lambda.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionLambda {

    public static List<Employee> createUsers(int noOfEmployees) {
        List<Employee> employeeList = new ArrayList<>();
        for(int i = 1; i <= noOfEmployees; i++) {
            Employee e = new Employee(i, "User"+(i), "PAN"+(i));
            employeeList.add(e);
        }
        return employeeList;
    }


    public static void main(String[] args) {

        List<Employee> employeeList = createUsers(10);

        //show pan number
        Function<Employee, String> panCardMapper = (Employee e) -> e.getPanCard();

        List<String> panCards = new ArrayList<>();

        for(Employee e: employeeList) {
            panCards.add(e.getPanCard());
        }

        System.out.println(panCards);

    }



}
