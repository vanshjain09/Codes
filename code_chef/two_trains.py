t=int(input())
for i in range(t):
    p=[]
    n=int(input())
    p=list(map(int, input().split()))
    total_time=0
    for i in p:
        total_time+=i
    print(total_time+p[n-2])

