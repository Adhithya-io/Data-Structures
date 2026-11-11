class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y)->y-x);
        for(int i:stones){
            pq.add(i);
        }
        while(pq.size()>1){
            int n1 = pq.poll();
            int n2 = pq.poll();
            int ans = Math.abs(n1-n2);
            if(ans == 0){
                continue;
            }
            pq.add(ans);
        }
        return pq.size() == 0?0:pq.peek();
    }
}
