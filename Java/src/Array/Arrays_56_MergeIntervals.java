class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        int[] x = new int[2];
        x[0] = intervals[0][0];
        x[1] = intervals[0][1];
        merged.add(x);
        for (int i=1; i< intervals.length; i++){
            int right1 =  merged.getLast()[1];
            int left2 = intervals[i][0];
            int right2 = intervals[i][1];
            if (left2 <= right1 && right1<= right2){
                merged.getLast()[1] = intervals[i][1];
            }
            if (left2 > right1 && right2 > right1){
                int[] t = new int[2];
                t[0] = intervals[i][0];
                t[1] = intervals[i][1];
                merged.add(t);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}