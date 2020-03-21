package com.natalita;

public class StringCalculator {
    public int add(String numbers) {
        if(numbers.isEmpty())
            return 0;
        if(numbers.contains(",")){
            String[] split = numbers.split(",");
            return Integer.parseInt(split[0])+Integer.parseInt(split[1])    ;
        }
        return Integer.parseInt(numbers);
    }
}
