package com.natalita;

import java.util.Arrays;

public class StringCalculator {
    public int add(String numbers) {
        if(numbers.isEmpty())
            return 0;
        if(numbers.contains(",")){
            return getSumFromStringNumbers(numbers.split(","));
        }
        return Integer.parseInt(numbers);
    }

    private int getSumFromStringNumbers(String[] numbers) {
        return Arrays.stream(numbers)
                .mapToInt(value -> Integer.parseInt(value))
                .sum();
    }
}
