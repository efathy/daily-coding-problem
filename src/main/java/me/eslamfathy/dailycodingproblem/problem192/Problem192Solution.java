package me.eslamfathy.dailycodingproblem.problem192;

import java.util.List;

public class Problem192Solution {

    public boolean isEndReachable(List<Integer> steps) {
        int expectedSteps = 0;
        for (int i = steps.size() - 1; i >= 0; i--) {
            if (steps.get(i) == 0 || expectedSteps > 0) {
                expectedSteps++;
            }

            if (expectedSteps <= steps.get(i)) {
                expectedSteps = 0;
            }
        }
        return expectedSteps == 0;
    }
}
