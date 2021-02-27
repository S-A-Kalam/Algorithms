import sys
def eggDrop(n,k):
    if(k==1 or n==0):
        return k
    if(n==1):
        return k 
    min=sys.maxsize

    for x in range(1,k+1):
        result=max(eggDrop(n-1,x-1),eggDrop(n,k-x))
        if(result<min):
            min=result
    return min+1

n=int(input("Enter n value"))
k=int(input("Enter k value")) 
print("Minimum number of trials in worst case with ",n,"eggs and",k,"floors is",eggDrop(n, k))           