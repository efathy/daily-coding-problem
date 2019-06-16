package me.eslamfathy.dailycodingproblem.problem192;

import me.eslamfathy.dailycodingproblem.problem157.Problem157Solution;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Problem192SolutionTest {

    @Test
    public void isEndReachable1() {
        Problem192Solution problem192Solution = new Problem192Solution();
        List<Integer> steps = new ArrayList<>(Arrays.asList(1, 3, 1, 2, 0, 1));
        assertTrue(problem192Solution.isEndReachable(steps));
    }

    @Test
    public void isEndReachable2() {
        Problem192Solution problem192Solution = new Problem192Solution();
        List<Integer> steps = new ArrayList<>(Arrays.asList(1, 2, 1, 0, 0));
        assertFalse(problem192Solution.isEndReachable(steps));
    }
}