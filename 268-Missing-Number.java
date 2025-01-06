class Solution {
    public int missingNumber(int[] nums) {
        List<Integer> num=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            num.add(nums[i]);
        }
        for(int i=0;i<=nums.length;i++){
            if(!num.contains(i)){
                return i;
            }
        }
        return 0;
    }
}