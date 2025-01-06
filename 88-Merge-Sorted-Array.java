class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        int []arr=new int [m+n];
        for(int i=0;i<m;i++){
            arr[k]=nums1[i];
            k++;
        }
        for(int j=0;j<n;j++){
            arr[k]=nums2[j];
            k++;
        }
        for(int f=0;f<k-1;f++){
            for(int g=f+1;g<k;g++){
                if(arr[f]>arr[g]){
                    int temp=arr[f];
                    arr[f]=arr[g];
                    arr[g]=temp;
                }
            }
        }
        for(int l=0;l<k;l++){
            nums1[l]=arr[l];
        }
        for(int y=0;y<k;y++){
            System.out.println(nums1[y]+" ");
        }
    }
}