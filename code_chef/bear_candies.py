t=int(input())
for i in range(t):
    total_linak=0
    linak=0
    tatal_bob=0
    bob=0
    a,b=(int(i) for i in input().split())
    while(1):
        linak=bob+1
        bob=linak+1
        total_linak+=linak
        tatal_bob+=bob
        if total_linak>a:
            print("Bob")
            break
        elif tatal_bob>b:
            print("Limak")
            break

