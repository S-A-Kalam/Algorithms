class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
    int m=nums1.length;
    int n=nums2.length;
    int i=0;
    int j=0;
    int k=0;
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    
    while(i<m && j<n)
    {
        if(nums1[i]==nums2[j])
        {
            nums1[k++]=nums1[i];
            i=i+1;
            j=j+1;
        }
        else if(nums1[i]<nums2[j])
        {
            i=i+1;
        }
        else
        {
            j=j+1;
        }
        
    }
    
    int[] result=new int[k];
    for(int p=0;p<k;p++)
        result[p]=nums1[p];
    return result;
    
}
    }
