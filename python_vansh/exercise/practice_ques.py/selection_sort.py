""" [3,2,6,9,1]
check min in the list and place it on the first and other 
remaining list is unsorted list same procedure repeated again"""

lst=[3,2,6,9,1]
for i in range(0,len(lst)):
    for j in range(i,len(lst)):
        lst[j]=min(lst)
        

        
print(lst)





