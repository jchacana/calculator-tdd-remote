package com.natalita;

public class StringCalculator {
    public int add(String numbers) {
        if(numbers.isEmpty())
            return 0;
        if(numbers.contains(",")){
            String[] split = numbers.split(",");

            int sum = 0;
            for (int i = 0; i < split.length; i++){
                sum = Integer.parseInt(split[i]) + sum;
            }
            return sum;
        }
        return Integer.parseInt(numbers);
    }
}
