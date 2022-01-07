package com.learnings.lambda;

import com.learnings.lambda.model.Employee;

import java.util.function.Function;

@FunctionalInterface
public interface MyComparator<T> {

    public static <U> MyComparator<U> comparing(Function<U, Comparable> f1) {
        return (t1, t2) -> f1.apply(t1).compareTo(f1.apply(t2));
    }

    public int compare(T t1, T t2);

    public default MyComparator<T> thenComparing(MyComparator<T> cmpEmployee) {
        return (t1, t2) -> compare(t1, t2) == 0 ? cmpEmployee.compare(t1, t2) : compare(t1, t2);
    };
}
