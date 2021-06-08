class Solution {
    public boolean isPalindrome(String s) {
        String st = s.toLowerCase();
        int c=0,j=0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)-97>=0 && st.charAt(i)-97<26||st.charAt(i)>=48 && st.charAt(i)<58)
                c++;
        }
        char[] str =new char[c];
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)-97>=0 && st.charAt(i)-97<26||st.charAt(i)>=48 && st.charAt(i)<58){
                str[j]=st.charAt(i);
                j++;
            }
        }
        int a ,b;
        a=0;
        b=c-1;
        while(a<b){
            if(str[a]!=str[b])
                return false;
            a++;
            b--;
        }
        return true;
    }
}
