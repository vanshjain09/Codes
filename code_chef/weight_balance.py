t=int(input())
for i in range(t):
    w1,w2,x1,x2,m=(int(i) for i in input().split())
    if (w2-w1)<(x2-x1)*m:
        print("0")
    elif ((w2-w1)>=(x2-x1)*m) and (1.1<(w2-w1)-(x2-x1)*m<2.2):
        print("1")
    else:
        print("0")

    
