package com.learnings.lambda;

@FunctionalInterface
public interface MyPredicate<P> {

    public boolean test(P p);

    public default MyPredicate<P> and(MyPredicate<P> mt5) {
        return p -> test(p) && mt5.test(p);
    }

    public default MyPredicate<P> or(MyPredicate<P> mt5) {
        return p -> test(p) || mt5.test(p);
    }
}
