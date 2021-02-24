# Recursive
def recur(string,start,end):
    if(start==end):
        return True
    if(string[start]!=string[end]):
        return False

    if(start<end+1):
        return recur(string,start+1,end-1)
    return  True    

def isPalindrome(str):
    n=len(str)
    if(n==0):
        return True
    return recur(str,0,n-1)

s=input("Enter String")
if(isPalindrome(s)):
    print("Palindrome")
else:
    print("Not a Palindrome")    