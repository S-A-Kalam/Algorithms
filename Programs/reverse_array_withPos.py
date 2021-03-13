def reverse(arr,n,k):
    i=0
    while(i<n):
        left=i
        right=min(i+k-1,n-1)
        while(left<right):
            arr[left],arr[right]=arr[right],arr[left]
            left+=1
            right-=1
        i+=k 
array=[1,3,5,7,9,11,13,15]
k=5           
n=len(array)
reverse(array,n,k)
for i in range(0,n):
    print(array[i],end=" ")