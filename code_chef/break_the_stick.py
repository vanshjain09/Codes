t=int(input())
for i in range(t):
    l,x=(int(i) for i in input().split())
    if l==x:
        print("Yes")
    elif(x%2==0 and (l-x)%2==0)or(x%2!=0 and (l-x)%2!=0):
     print("Yes")
    else:
     print("NO")

