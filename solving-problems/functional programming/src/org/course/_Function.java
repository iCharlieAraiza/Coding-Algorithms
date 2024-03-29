package org.course;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public Function<Integer, Integer> incrementByOne = number -> number + 1;

    public Function<Integer, Integer> multiplyByTen = number -> number * 10;

    public BiFunction<Integer, Integer, Integer> addOneAndMultiplyBy =
            ( baseNumber, multiplyByThisNumber ) -> (baseNumber + 1) * multiplyByThisNumber;

}
