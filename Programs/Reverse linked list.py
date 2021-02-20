class Node:
    def __init__(self,data=None):
        self.data=data
        self.next=None
class LinkedList:
    def __init__(self):
        self.head=None
    def Lprint(self):
        pval=self.head
        while pval is not None:
            print(pval.data)
            pval=pval.next    

l=LinkedList()
x=int(input("Length of the list"))
f=input("Input the first node")
l.head=Node(f)
for i in range(x):
    inp=input("Enter the value")
    l.