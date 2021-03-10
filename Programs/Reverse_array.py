def reverse(arr,start,end):
    while start<end:
        arr[start],arr[end]=arr[end],arr[start]
        start+=1 
        end-=1
n=int(input())
array=[]
for i in range(n):
    x=int(input())
    array.append(x)
reverse(array,0,n-1)        
for i in range(n):
    print(array[i])