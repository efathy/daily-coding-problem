package me.eslamfathy.dailycodingproblem.problem184;

import java.util.List;

public class Problem184Solution {

    public int getGCD(List<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            result = findGCD(result, number);
        }
        return result;
    }

    private int findGCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        return findGCD(b % a, a);
    }
}
