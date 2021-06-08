class Solution {
    public boolean isAnagram(String s, String t) {
        int[] h=new int[26];
        if(s.length()!=t.length())
            return false;
        if(s.length()==t.length()){
            for(int i=0;i<s.length();i++)
                h[s.charAt(i)-97]+=1;
            for(int i=0;i<t.length();i++)
                h[t.charAt(i)-97]-=1;
             for(int i=0;i<s.length();i++)
                if(h[s.charAt(i)-97]!=0)
                    return false;
                    
            }
            return true;
        
    }
}
