package com.prueba.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListNumbers {

    private final List<Integer> numbers;
    private int sumNumbers;

    public ListNumbers() {
        numbers = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        int cantNumbers = numbers.size();
        sumNumbers = (numbers.get(0) + numbers.get(cantNumbers - 1)) * (cantNumbers / 2);
    }

    public String extract(int n) {
        if (n < 0 || n > 99) {
            return "The number must be between 0 and 99";
        } else if (numbers.size() < 100) {
            return "Only one number can be extracted";
        } else {
            numbers.remove(n);
            return "The number was extracted";
        }
    }

    public String calculateNumber() {
        if (numbers.size() < 100) {
            int numExtracted = sumNumbers - numbers.stream().mapToInt(Integer::intValue).sum();
            return "The extracted number was " + numExtracted;
        } else {
            return "A number has not been extracted";
        }
    }
	
}
