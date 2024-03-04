package task;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int x = sumIntervals(new int[][]{{1, 4}, {3, 5}, {11, 15}});
        System.out.println(x);
    }

    public static int sumIntervals(int[][] intervalsArray) {
        ParserInterval parserInterval = new ParserInterval();
        List<Interval> intervals = parserInterval.parse(intervalsArray);

        OverlapChecker overlapChecker = new OverlapChecker();
        IntervalFusion intervalFusion = new IntervalFusion();
            //{1, 4}, {3, 5}, {11, 15}}
        for (int i = 0; i < intervals.size(); i++) { // 0, 1, 2
            for (int j = i + 1; j < intervals.size(); j++) { // 1    {1, 5}, {11, 15}
                if (overlapChecker.isOverlap(intervals.get(i), (intervals.get(j)))) { // [1, 4], [3, 5] = true // [3, 5], [11, 15] = false
                    Interval merge = intervalFusion.merge(intervals.get(i), intervals.get(j)); // 1, 5
                    intervals.set(i, merge); // 0 = 1, 5  {1, 5}, {3, 5}, {11, 15}
                    intervals.remove(j); // {1, 5}, {11, 15}
                    j--; //
                }
            }
        }

        AddIntervals addIntervals = new AddIntervals();
        return addIntervals.add(intervals);
    }
}
