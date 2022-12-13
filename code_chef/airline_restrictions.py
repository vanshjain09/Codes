t=int(input())
for i in range(t):
    a,b,c,d,e=(int(i) for i in input().split())
    if((a<=e and b+c<=d)or(b<=e and a+c<=d)or(c<=e and a+b<=d)):
        print("Yes")
    else:
        print("No")
