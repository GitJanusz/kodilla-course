package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        int number = 0;
        for (int n=0; n<numbers.size(); n++) {
            number = numbers.get(n);
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
        return numbers;
    }
}