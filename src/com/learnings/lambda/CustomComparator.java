package com.learnings.lambda;

import com.learnings.lambda.model.Employee;

public class CustomComparator {

    public static void main(String[] args) {

        MyComparator<Employee> idComparator = (e1, e2) -> e2.getId() - e1.getId();
        MyComparator<Employee> nameComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());
        MyComparator<Employee> panComparator = (e1, e2) -> e1.getPanCard().compareTo(e2.getPanCard());

        //functions are created to help us in above extraction
        /*Function<Employee, String> panFunction = Employee::getPanCard;
        Function<Employee, Integer> idFunction = Employee::getId;
        Function<Employee, String> nameFunction = Employee::getName;*/

        //Function<Employee, String> nameFunction = Employee::getName;
        MyComparator<Employee> cmpEmployee = MyComparator.comparing(Employee::getPanCard);
        MyComparator<Employee> cmpEmployeeId = MyComparator.comparing(Employee::getId);

        //chaining comparators
        MyComparator<Employee> idAndPanComparator = cmpEmployeeId.thenComparing(cmpEmployee);
    }

}
