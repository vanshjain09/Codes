from numpy import *
arr=array([1,2,3,4,5])
#to add every element with 5   *****MANNUALY*****
for i in range(5):
    arr[i]+=5
print(arr)
# ******using function*****
arr=arr+5
print(arr)
#to add two arrays
arr1=array([1,2])
arr2=array([3,4])
arr3=arr1+arr2
print(arr3)
# more mathematical operation
print(sin(arr1))
print(sqrt(arr1))
print(log(arr1))
print(sum(arr1))
#some simple operation
print(min(arr1))
print(max(arr1))
print(len(arr1))
#print(sort())

#**********COPYING A ARRAY*********************#

#to create a new array witrh different memory locations we use 
# view function for  swallow copy
# copy function to deep copy
a=array([1,2,3,4])
b=a.view()
print(b)
print(id(a))
print(id(b))




