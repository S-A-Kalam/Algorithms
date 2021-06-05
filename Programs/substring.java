class Solution {
    public int strStr(String haystack, String needle) {
        int j=0,i=0;
        if(needle.length()==0)
            return 0;
        if(haystack.contains(needle)){
            i=haystack.indexOf(needle);
            return i;
            
        }
            return -1;
        
    }
}
