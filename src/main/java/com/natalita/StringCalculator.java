package com.natalita;

import java.util.Arrays;

public class StringCalculator {


    public static final String COMA = ",";

    public int add(String numbers) {
        String separator = COMA;
        if(numbers.isEmpty())
            return 0;
        if(numbers.startsWith("//")) {
            String[] split = numbers.split("\n");// --> [//;][1;2]
            separator = split[0].substring(2);
            numbers = split[1];
        }
        numbers = numbers.replace("\n", separator);
        if(numbers.contains(separator)){
            return getSumFromStringNumbers(numbers.split(separator));
        }
        return Integer.parseInt(numbers);
    }

    private int getSumFromStringNumbers(String[] numbers) {
        return Arrays.stream(numbers)
                .mapToInt(value -> Integer.parseInt(value))
                .sum();
    }

}
