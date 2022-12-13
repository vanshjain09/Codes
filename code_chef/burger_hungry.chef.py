T=int(input())
for i in range(T):
    X=int(input()) #cost of simple burger
    Y=int(input()) #cost of premium burger
    N=int(input()) #no of burgers
    R=int(input()) #rupees
    if R<N*X:
        print(-1)
    elif R>N*Y:
        a=0
        b=N
        print(a,b)
    else:
        b=(R-N*X)//(Y-X)
        a=N-b
        print(a,b)
        
    
