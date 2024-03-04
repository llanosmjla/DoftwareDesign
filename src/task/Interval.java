package task;

public class Interval {
    private int start;
    private int end;

    public Interval(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start cannot be greater than end");
        }
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int length() {
        // {1, 5} --> 5 - 1 = 4
        // {11, 15} --> 15 - 11 = 4
        return end - start;
    }
}
