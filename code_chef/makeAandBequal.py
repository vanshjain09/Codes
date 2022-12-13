t=int(input())
for i in range(t):
    a,b=(int(i) for i in  input().split())
    while(1):
        if a<b:
            a=a*2
            if a==b:
                print("YES")
                break
            elif a>b:
                print("NO")
                break
        elif b<a:
            b=b*2
            if b==a:
                print("YES")
                break
            elif b>a:
                print("NO")
                break
        elif a==b:
            print("YES")
            break