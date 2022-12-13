s=input()
lst=[]
new=""
for i in s:
    lst.append(i)
lst[0]=lst[0].upper()
for i in range(0,len(lst)):
    if lst[i]==" ":
        lst[i+1]=lst[i+1].upper()
for j in lst:
    new+=j
print(new)


    

    

