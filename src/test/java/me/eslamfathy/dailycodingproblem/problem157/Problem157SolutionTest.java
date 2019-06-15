package me.eslamfathy.dailycodingproblem.problem157;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Problem157SolutionTest {

    @Test
    public void isPalindrome1() {
        String word = "carrace";
        Problem157Solution problem157Solution = new Problem157Solution();
        assertTrue(problem157Solution.isPalindrome(word));
    }

    @Test
    public void isPalindrome2() {
        String word = "daily";
        Problem157Solution problem157Solution = new Problem157Solution();
        assertFalse(problem157Solution.isPalindrome(word));
    }
}