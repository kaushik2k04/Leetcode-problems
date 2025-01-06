class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> s1=new HashSet<>();
       Set<Integer> s2=new HashSet<>();
       


       for(int i=0;i<nums1.length;i++){
         s1.add(nums1[i]);
       }
         for(int j=0;j<nums2.length;j++){
                if(s1.contains(nums2[j])){
                    s2.add(nums2[j]);
                }
       }

       int arr[]=new int[s2.size()];
       int k=0;
       for(int a:s2){
            arr[k++]=a;
       }
       return arr;
    }
}