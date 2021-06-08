class Solution {
    long res = 0;
    public int reverse(int x) {
        boolean isNeg = false;
        if(x < 0)
            isNeg = true;
        if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) 
            return 0;
        if(isNeg == false){
            rev(x);
            return (int)res;
        }
        rev(0-x);
        return (0 - (int)res);
    }
    public void rev(int num){
        
        while(num > 0){
            res = res*10 + num%10;
            num /= 10;
        }
        if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE)
            res = 0;
    }
}
