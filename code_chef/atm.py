t=int(input())
a=[]
for i in range(t):
    n,k=[int(i) for i in input().split()]
    balance=k
    for i in range(n):
        x=int(input())
        a.append(x)
    for i in a:
        if i<=balance:
            print("1",end=" ")
            balance-=i
        elif i>balance:
            print("0",end=" ")



    
