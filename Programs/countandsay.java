class Solution{
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 2; i <= n; i++) {
            s = say(s);
        }
        return s;
    }
    public String say(String s) {
        String a = "";
        int c = 1,i;
        for (int j = 0; j < s.length(); j++) {
            if(j+1 != s.length() && s.charAt(j) == s.charAt(j+1)){
                c++;
                continue;
            }
            i=s.charAt(j)-48;
            a = a + c + i;
            c=1;
        }
        return a;
    }
}
