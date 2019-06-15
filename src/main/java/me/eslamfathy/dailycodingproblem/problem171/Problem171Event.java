package me.eslamfathy.dailycodingproblem.problem171;

public class Problem171Event {
    private String timestamp;
    private int count;
    private Problem171Type type;

    public Problem171Event() {
    }

    public Problem171Event(String timestamp, int count, Problem171Type type) {
        this.timestamp = timestamp;
        this.count = count;
        this.type = type;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Problem171Type getType() {
        return type;
    }

    public void setType(Problem171Type type) {
        this.type = type;
    }
}
