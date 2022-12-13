t=int(input())
for i in range(t):
    x=int(input())
    a=0
    b=0
    while(1):
        if 2*a+2*b+a*b==x:
            print("YES")
            break
        elif 2*a+2*b+a*b>x:
            print("NO")
            break
        a+=1
        b+=1
