package task;

public class OverlapChecker {
    public boolean isOverlap(Interval a, Interval b) {
        //[1, 3], [4, 5] --> 1, 5
        // [4, 5], [1, 3] --> 1, 5
        // [4, 5], [4, 6] --> 4, 6

        return a.getStart() >= b.getStart() && a.getStart() <= b.getEnd() // 1>=4 && 1<=5  // 4>=1 && 4<=3
                || a.getEnd() >= b.getStart() && a.getEnd() <= b.getEnd() // 3>=4 && 3<=5 // 5>=1 && 5<=3
                || b.getStart() >= a.getStart() && b.getStart() <= a.getEnd() // 4>=1 && 4<=3 // 1>=4 && 1<=5
                || b.getEnd() >= a.getStart() && b.getEnd() <= a.getEnd(); // 5>=1 && 5<=3  // 3>=4 && 3<=5
    }
}
