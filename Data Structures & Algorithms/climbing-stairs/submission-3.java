class Solution {
    public int climbStairs(int n) {
        // if(n==1) return 1;
        // if(n==2) return 2;
        // return climbStairs(n-1)+climbStairs(n-2);
        HashMap<Integer, Integer> memo=new HashMap<>();
        return climbstairs(n,memo);
    }
    private int climbstairs(int n, HashMap<Integer, Integer> memo){
        if(n==0 || n==1) return 1;
        if(!memo.containsKey(n)){
            memo.put(n,climbstairs(n-1,memo)+climbstairs(n-2,memo));
        }
        return memo.get(n);
    }
}
