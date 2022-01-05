package com.learnings.lambda;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;

public class PrimitiveLambdas {

    public static void main(String[] args) {


        IntSupplier integerSupplier = () -> 1;
        integerSupplier.getAsInt();

        DoubleToIntFunction doubleToIntFunction =
                (double value) -> (int)Math.ceil(value);
        int myVal = doubleToIntFunction.applyAsInt(5.1);
        System.out.println(myVal);


    }
}
