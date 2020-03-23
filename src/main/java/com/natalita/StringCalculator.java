package com.natalita;

import java.util.Arrays;

public class StringCalculator {


    public static final String COMA_OR_NEWLINE = ",|\n";
    public static final String NEWLINE = "\n";
    public static final String PREFIX = "//";

    public int add(final String input) {
        if(input.isEmpty())
            return 0;
        String numbers = input;
        String separator = COMA_OR_NEWLINE;
        if(input.startsWith(PREFIX)) {
            separator = identifySeparator(numbers);
            numbers = getNumbers(numbers);
        }
        return getSumFromStringNumbers(numbers.split(separator));
    }

    private String getNumbers(final String input) {
        return input.split(NEWLINE)[1];
    }

    private String identifySeparator(final String numbers) {
        return numbers.substring(PREFIX.length(), numbers.indexOf(NEWLINE));
    }

    private int getSumFromStringNumbers(final String[] numbers) {
        return Arrays.stream(numbers)
                .mapToInt(value -> Integer.parseInt(value))
                .sum();
    }

}
