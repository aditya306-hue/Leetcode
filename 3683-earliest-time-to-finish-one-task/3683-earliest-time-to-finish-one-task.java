class Solution {
    public int earliestTime(int[][] tasks) {
        int minTask = Integer.MAX_VALUE;
        for(int i = 0; i<tasks.length; i++){
            int finishTask = tasks[i][0] + tasks[i][1];
            minTask = Math.min(minTask  , finishTask);
        }
        return minTask;
    }
}