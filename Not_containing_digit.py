def findAB(n,k):
	flag=0
	for i in range(1,n):
		if str(i).count(chr(k + 48)) == 0 \
        and str(n-i).count(chr(k + 48)) == 0:
            print(i, n-i)
            flag = 1
            break
 
    
    if(flag == 0):
        print(-1)
N =int(input())
K = 0
findAandB(N, K)