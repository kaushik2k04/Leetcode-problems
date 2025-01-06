class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        HashMap<Integer,Boolean> map=new HashMap<>();

        for(int num:nums){
            map.put(num,true);
        }
        for(int num:nums){
            if(map.containsKey(num-1)){
                map.put(num,false);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)==true){
                int len=1;
                while(map.containsKey(key+len)){
                    len++;
                }
                max=Math.max(max,len);
            }
        }
    return max;

    }
}