class Solution {
    public int[] plusOne(int[] digits) {
            
    int count = 0; 
	int len = digits.length;
	
	for (int i = 0; i < len; i++) {   
	    if (digits[i] == 9) {
	        count += 1;
	    }
	}
	
	if (count == len) {   
	    int res[] = new int[len + 1];
	    for (int x = len - 1; x >= 0; x--) {
	        res[x + 1] = 0;
	        res[0] = 1;
	    }
	    return res;
	} else {   
	    digits[len - 1] += 1;
	    for (int m = len - 1; m >= 0; m--) {
	        if (digits[m] == 10) {
	            digits[m] = 0;
	            digits[m - 1] = digits[m - 1] + 1;
	        }
	    }
	    return digits;
	}
}
}
