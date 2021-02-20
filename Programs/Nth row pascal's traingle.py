# Efficient approach
def Throw(n):
    prev=1#nC0
    print(prev,end='')
    
    for i in range(1,n+1):
        curr=(prev*(n-i+1))//i
        print(",",curr, end="")
        prev=curr
x=int(input("Enter N value"))        
Throw(x)

#Naive approach
def Row(index):
    currow=[]
    currow.append(1)
    if(index==0):
        return currow
    prev=Row(index-1)

    for i in  range(1,len(prev)):
        curr=prev[i-1] +prev[i]
        currow.append(curr)
    currow.append(1)
    return currow

x=int(input("Enter n"))
arr=Row(x)
for i in range(len(arr)):
    print(arr[i],end=" ")