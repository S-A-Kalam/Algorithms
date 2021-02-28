def add_edge(x,y):
    global adj
    adj[x].append(y)
    adj[y].append(x)

def Dfs(x,parent_node=-1):
    global adj,parent 
    parent[x]=parent_node
    for child in  adj[x]:
        if(child!=parent_node):    #Recursive call for dfs
            Dfs(child,x)   

def SmallerAncestor(n):
    global parent,adj
    Dfs(1)
    for i in range(1,n+1):
        node = i
        count=0
        while(parent[node]!=-1):
            if(parent[node]<i):
                count+=1
            node=parent[node]
        print(count,end=" ")

n=int(input())
adj=[[] for i in range(10**5)]
parent=[0]*(10**5)
add_edge(1,5)
add_edge(1,4)
add_edge(4,6)
add_edge(5,3)
add_edge(5,2)
SmallerAncestor(n)