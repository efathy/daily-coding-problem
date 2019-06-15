package me.eslamfathy.dailycodingproblem.problem171;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem171SolutionTest {

    @Test
    public void getBusiestTime1() {
        List<Problem171Event> events = new ArrayList<>();
        events.add(new Problem171Event("1", 3, Problem171Type.ENTER));
        events.add(new Problem171Event("2", 2, Problem171Type.ENTER));
        events.add(new Problem171Event("3", 3, Problem171Type.EXIT));
        events.add(new Problem171Event("4", 1, Problem171Type.EXIT));
        Problem171Solution problem171Solution = new Problem171Solution();

        Problem171Result problem171Result = problem171Solution.getBusiestTime(events);

        assertEquals("2", problem171Result.getStartTime());
        assertEquals("3", problem171Result.getEndTime());
    }


    @Test
    public void getBusiestTime2() {
        List<Problem171Event> events = new ArrayList<>();
        events.add(new Problem171Event("1", 3, Problem171Type.ENTER));
        events.add(new Problem171Event("2", 3, Problem171Type.EXIT));
        Problem171Solution problem171Solution = new Problem171Solution();

        Problem171Result problem171Result = problem171Solution.getBusiestTime(events);

        assertEquals("1", problem171Result.getStartTime());
        assertEquals("2", problem171Result.getEndTime());
    }
}