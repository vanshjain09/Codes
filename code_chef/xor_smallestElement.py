t=int(input())
for i in range(t):
    n,x,y=(int(i) for i in input().split())
    a=[]
    min_index=0
    a = list(map(int, input().split()))
    for i in range(y):
        for j in range(n):
            if a[j]==min(a):
             min_index=j
             break
        a[min_index]=a[min_index]^x
    a.sort()
    for i in range(len(a)):
        print(a[i],end=" ")
    print()



        
            
    



