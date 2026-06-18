class Solution {
    public double angleClock(int hour, int minutes) {
        // for 1hr --> 30* and for 1minute hour angle --> 30/60 == 0.5* hour angle moves
       double hourAngle = (hour % 12) * 30 + minutes * 0.5;
       //for 1min --> 6* minute angle moves
       double minuteAngle = minutes * 6;
       double diff = Math.abs(hourAngle - minuteAngle);
       return Math.min(diff ,  360 - diff);
    }
}