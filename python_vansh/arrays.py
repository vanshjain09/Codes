from array import *
vals=array('i',[1,2,3,6,5])
#here i is type code of array 
print(vals)
#function to get size and address of array
print(vals.buffer_info())
#to reverse a array
vals.reverse()
print(vals)
#to print length of array
print(len(vals))

#access value by index
for i in range(5):
    print(f" value at index {i} is {vals[i]}")

#want to do square of newarr
newArrsq=array('i',(a*a for a in newArr))
print(newArrsq)




