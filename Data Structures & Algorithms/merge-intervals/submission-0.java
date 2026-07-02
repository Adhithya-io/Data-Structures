class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1){
            return intervals;
        }
        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
        int[] newInterval = intervals[0];
        List<int[]> arr = new ArrayList<>();
        arr.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] <= newInterval[1]){
                newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            }
            else{
                newInterval = intervals[i];
                arr.add(newInterval);
            }
        }
        return arr.toArray(new int[arr.size()][]);
    }
}
