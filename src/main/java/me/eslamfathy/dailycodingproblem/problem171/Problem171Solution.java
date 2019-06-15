package me.eslamfathy.dailycodingproblem.problem171;

import java.util.List;

public class Problem171Solution {

    public Problem171Result getBusiestTime(List<Problem171Event> events) {
        Problem171Result result = new Problem171Result("", "");
        int maxCount = 0;
        int currentCount = 0;
        for (Problem171Event event : events) {
            if (event.getType() == Problem171Type.ENTER) {
                currentCount += event.getCount();
                if (maxCount < currentCount) {
                    result.setStartTime(event.getTimestamp());
                    maxCount = currentCount;
                }
            } else {
                if (currentCount == maxCount) {
                    result.setEndTime(event.getTimestamp());
                }
                currentCount -= event.getCount();
            }
        }
        return result;
    }

}
