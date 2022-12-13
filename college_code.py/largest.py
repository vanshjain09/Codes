lst=[30,25,45,60,92,83]
large=0
for i in lst:
    if i>large:
        large=i
print(large)

#second largest
l1=0
l2=0
for i in range(len(lst)):
    if lst[i]>l1:
        l2=l1
        l1=lst[i]
print(l1,l2)
