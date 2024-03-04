package task;

import java.util.List;

public class AddIntervals {
    public int add(List<Interval> intervals) {
        int sum = 0;
        for (Interval interval : intervals) {
            sum += interval.length();// 4 + 4
        }
        return sum;
    }




}
