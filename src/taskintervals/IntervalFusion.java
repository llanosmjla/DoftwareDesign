package taskintervals;

public class IntervalFusion {
    public Interval merge(Interval a, Interval b) {
        return new Interval(Math.min(a.getStart(), b.getStart()), Math.max(a.getEnd(), b.getEnd()));
        //  1, 5
    }

}
