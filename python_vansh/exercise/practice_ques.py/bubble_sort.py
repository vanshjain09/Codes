lst=[3,2,6,9,1]
for i in range(len(lst)-1,0,-1):
    for j in range(i):
        if lst[j]>lst[j+1]:
            lst[j],lst[j+1]=lst[j+1],lst[j]
print(lst)

