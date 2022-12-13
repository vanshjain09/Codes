t=int(input())
for i in range(t):
    w,h,p=[],[],[]
    price_bud=[]
    area_bud=[]
    n,b=(int(i) for i in input().split())
    for i in range(n):
        x,y,z=(int(i) for i in input().split())
        w.append(x)
        h.append(y)
        p.append(z)
    for i in range(n):
        if p[i]<=b:
            price_bud.append(i)
    try:
        for i in price_bud:
         area_bud.append(w[i]*h[i])
        print(max(area_bud))
    except:
        print("no tablet")




        