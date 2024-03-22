package taskintervals;

import java.util.ArrayList;
import java.util.List;

public class ParserInterval {
    public static Interval parse(int[] pair) {
        return new Interval(pair[0], pair[1]);
    }

    public static List<Interval> parse(int[][] matrixOfIntervals) {
        List<Interval> intervals = new ArrayList<>();
        System.out.println("Len : " + matrixOfIntervals.length);
        for (int[] matrixOfInterval : matrixOfIntervals) {
            intervals.add(parse(matrixOfInterval));
            //System.out.println("Matrix of intervals : " + intervals.get(i).getStart() + " " + intervals.get(i).getEnd());
        }
        return intervals;
    }

}
