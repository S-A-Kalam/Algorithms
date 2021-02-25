def LongestPrefix(string):
    n=len(string)
    for res in range(n//2,0,-1):
        prefix=string[0:res]
        suffix=string[n-res:n]

        if(prefix==suffix):
            print(res)
            return res
            
        
        
    return 0


stri=input("Enter String")
LongestPrefix(stri)