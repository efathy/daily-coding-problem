package me.eslamfathy.dailycodingproblem.problem157;

import java.util.HashMap;
import java.util.Map;

public class Problem157Solution {

    public boolean isPalindrome(String word) {
        Map<Character, Integer> occurrences = new HashMap<>();
        int numberOfOdd = 0;
        for (Character currentCharacter : word.toCharArray()) {
            if (occurrences.containsKey(currentCharacter)) {
                occurrences.put(currentCharacter, occurrences.get(currentCharacter) + 1);
                numberOfOdd += occurrences.get(currentCharacter) % 2 == 0 ? -1 : 1;
            } else {
                occurrences.put(currentCharacter, 1);
                numberOfOdd++;
            }
        }
        return numberOfOdd < 2;
    }
}
