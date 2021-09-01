class Solution {
    public int arrayNesting(int[] nums) {
        int[] a=new int[nums.length+1];
        int maxcount=0,count=0; 
       for(int i=0;i<nums.length;i++){ 
           count=0;
        a[0]=nums[i];
        for(int j=1;j<a.length;j++){
            a[j]=nums[a[j-1]];
            count++;
            if(a[j]==a[0])
                break;
        }
           if(maxcount<count)
               maxcount=count;
       }
        return maxcount;
    }
}
