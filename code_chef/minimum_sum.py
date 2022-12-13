#https://www.codechef.com/START52D/problems/MINSM
import math
t=int(input())
for i in range(t):
    sum=0
    n=int(input())
    a= list(map(int, input().split()))
    for i in range(0,n-1):
        if a[i]>a[i+1]:
            if math.gcd(a[i], a[i+1]) < a[i]:
                a[i]=math.gcd(a[i], a[i+1])
            elif (math.gcd(a[i], a[i+1]) >=a[i]):
                a[i]=a[i]
        elif a[i+1]>=a[i]:
             if math.gcd(a[i], a[i+1]) < a[i+1]:
                a[i+1]=math.gcd(a[i], a[i+1])
             elif (math.gcd(a[i], a[i+1]) >= a[i]):
                a[i+1]=a[i+1]
    for j in a:
        sum+=j
    print(sum)
    