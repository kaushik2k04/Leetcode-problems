class Solution {
    public int maxProfit(int[] arr) {
        int a=arr[0],cost=0,ans=0;
        for(int i=1;i<arr.length;i++){
             cost=arr[i]-a;
             ans=Math.max(ans,cost);
             a=Math.min(a,arr[i]);

        }
        return ans;
    }
}   