class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        int[] c;
        c = new int[100000];
        double median=0.00;
        int m=nums1.length;
        int n=nums2.length;
        while(i<m && j<n){
            if(nums1[i]<nums2[j])
                c[k++]=nums1[i++];
            else
                c[k++]=nums2[j++];
        }
        for(i=i;i<m;i++)
            c[k++]=nums1[i];
        for(j=j;j<n;j++)
            c[k++]=nums2[j];
        k=m+n;
        if(k%2 !=0){
            median=(double) c[k/2];}
        else
            median =(double) (c[(k/2)]+c[(k/2)-1])/2;
         return median;
    }
   
    
}
