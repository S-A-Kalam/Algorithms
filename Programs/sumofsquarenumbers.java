class Solution {
    public boolean judgeSquareSum(int c) {
      int begin = 0; 
      int end = (int) Math.sqrt(c);
        
        while (begin<=end){
        
            int tmp = begin*begin + end * end; 
           
            if(tmp< c){
                begin++;            
            }
            else if(tmp >c){
                end--;
            }
            
            else{
                return true;
            }
              
        }
        
        return false;
        
    }
}
