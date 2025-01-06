class Solution {
    public int maxProfit(int[] arr) {
        int a;
        int sum=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                a=arr[i]-arr[i-1];
                sum+=a;
            }
        }
        return sum;
    }
}