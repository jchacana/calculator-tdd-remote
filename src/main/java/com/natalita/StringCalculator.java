package com.natalita;

import java.util.Arrays;

public class StringCalculator {


    public static final String COMA_OR_NEWLINE = ",|\n";
    public static final String NEWLINE = "\n";
    public static final String PREFIX = "//";

    public int add(String input) {
        if(input.isEmpty())
            return 0;

        String separator = COMA_OR_NEWLINE;
        if(input.startsWith(PREFIX)) {
            separator = identifySeparator(input);
            input = getNumbers(input);
        }
        return getSumFromStringNumbers(input.split(separator));
    }

    private String getNumbers(String input) {
        return input.split(NEWLINE)[1];
    }

    private String identifySeparator(String numbers) {
        return numbers.substring(PREFIX.length(), numbers.indexOf(NEWLINE));
    }

    private int getSumFromStringNumbers(String[] numbers) {
        return Arrays.stream(numbers)
                .mapToInt(value -> Integer.parseInt(value))
                .sum();
    }

}
