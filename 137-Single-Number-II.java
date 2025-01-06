class Solution {
    public int singleNumber(int[] nums) {
        int c,ans=0;
        for(int i=0;i<nums.length;i++){
            c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i!=j){
                    c++;
                }

            }
            if(c==0){
                ans=nums[i];
            break;
            }
            
        }
        return ans;
    }
}