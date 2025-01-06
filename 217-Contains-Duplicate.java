class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[i+1]){
                count++;
                return true;
                
            }
            break;
            }
        }
            return false;
     
    }
}