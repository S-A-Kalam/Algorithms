def maxStr(str,n):
    count_0=0
    count_1=0
    count=0
    for i in range(n):
        if str[i]=='0':
            count_0+=1
        else:
            count_1+=1    
        if count_0==count_1:
            count+=1   
    if count_0!=count_1:
        return -1
    return count      
string=input("Enter string")
n=len(string)
print(maxStr(string,n))           