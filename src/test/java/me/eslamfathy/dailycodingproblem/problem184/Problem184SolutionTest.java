package me.eslamfathy.dailycodingproblem.problem184;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem184SolutionTest {

    @Test
    public void getGCD1() {
        List<Integer> numbers = Arrays.asList(42, 56, 14);
        Problem184Solution problem184 = new Problem184Solution();
        assertEquals(14, problem184.getGCD(numbers));
    }

    @Test
    public void getGCD2() {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8);
        Problem184Solution problem184 = new Problem184Solution();
        assertEquals(2, problem184.getGCD(numbers));
    }

    @Test
    public void getGCD3() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        Problem184Solution problem184 = new Problem184Solution();
        assertEquals(1, problem184.getGCD(numbers));
    }
}