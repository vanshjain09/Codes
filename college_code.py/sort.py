lst=[]
n=int(input("enter length of list:"))
for i in range(n):
    x=int(input())
    lst.append(x)
print(lst)
for i in range(n-1):
    j=i+1
    if(lst[i]>lst[j]):
        (lst[i],lst[j])=(lst[j],lst[i])
print(lst)

 