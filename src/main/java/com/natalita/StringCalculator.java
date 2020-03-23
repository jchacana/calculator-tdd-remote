package com.natalita;

import java.util.Arrays;

public class StringCalculator {


    public static final String COMA = ",";

    public int add(String numbers) {
        if(numbers.isEmpty())
            return 0;
        numbers = numbers.replace("\n", COMA);
        if(numbers.contains(COMA)){
            return getSumFromStringNumbers(numbers.split(COMA));
        }
        return Integer.parseInt(numbers);
    }

    private int getSumFromStringNumbers(String[] numbers) {
        return Arrays.stream(numbers)
                .mapToInt(value -> Integer.parseInt(value))
                .sum();
    }

}
