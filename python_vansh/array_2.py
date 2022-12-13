# taking input from user
from array import *
arr=array('i',[])
n=int(input("Enter length of array:"))
for i in range(n):
    x=int(input("enter value:"))
    arr.append(x)

#program to find index number of a element in array
arr2=array('i',[12,66,52,0,89])
a=int(input("enter number to search index:"))
for i in range(5):
    if arr2[i]==a:
        print(f"index no. is {i}")
    else:
        pass
#inbuilt function to find index 
print(arr2.index(89))
