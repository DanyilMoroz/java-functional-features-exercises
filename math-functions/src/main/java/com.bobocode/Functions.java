package com.bobocode;

import static java.lang.Math.signum;
import static java.lang.Math.sqrt;

public class Functions {
    /**
     * A static factory method that creates an integer function map with basic functions:
     * - abs (absolute value)
     * - sgn (signum function)
     * - increment
     * - decrement
     * - square
     *
     * @return an instance of {@link FunctionMap} that contains all listed functions
     */
    public static FunctionMap<Integer, Integer> intFunctionMap() {
        FunctionMap<Integer, Integer> intFunctionMap = new FunctionMap<>();

        // todo: add simple functions to the function map (abs, sng, increment, decrement, square)
        intFunctionMap.addFunction("abs", Math::abs);
        intFunctionMap.addFunction("sgn", n -> (int) signum(n));
        intFunctionMap.addFunction("increment", n -> ++n);
        intFunctionMap.addFunction("decrement", n -> --n);
        intFunctionMap.addFunction("square", n -> n*n);
        return intFunctionMap;
    }
}
