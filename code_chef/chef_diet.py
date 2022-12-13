n=int(input())
k=int(input())
a=[]
rem=0
for i in range(n):
    x=int(input())
    a.append(x)
for i in range(n):
    if i<n-1:
        if a[i]>k:
            rem=a[i]-k
            a[i+1]+=rem
        elif a[i]<k:
            print("No" ,a.index(a[i])+1)
            break
    elif i==n-1:
        if a[i]>k:
            print("Yes")
        elif a[i]<k:
            print("No" ,a.index(a[i])+1)
            break

