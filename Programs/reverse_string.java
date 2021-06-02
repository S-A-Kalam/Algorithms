class Solution {
    public void reverseString(char[] s) {
        char st;
        int j=s.length-1;
        for(int i=0;i<j;i++,j--){
            st=s[i];
            s[i]=s[j];
            s[j]=st;
        }
    }
}
