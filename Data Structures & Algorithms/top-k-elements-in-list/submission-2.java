class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[]=new int[k];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> heap=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            heap.add(entry);
            if(heap.size()>k){
                heap.poll();
            }
        }
         int i=0;
    while(!heap.isEmpty()){
        ans[i++]=heap.poll().getKey();
    }
    return ans;
    }
   
}
