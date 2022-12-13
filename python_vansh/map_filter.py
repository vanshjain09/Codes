def func(a):
    return a*a
        
num=["33","9","73"]
num2=list(map(int,num))
num2[1]=num2[1]+2
print(num[1])
#wap to print squares of all the elements in list
num=[2,3,4,5,6,7,8,9]
squares=list(map(func,num))
print(squares)
#-----------FILTER---------FILTER--------------FILTER------------FILTER---
lis=[1,2,3,4,5,6,7,8,9]
def greaterthan5(a):
    return a>5
#greater5=list(map(greaterthan5, lis))
#in this case map function return boolen 
#so we use filter function with same syntax
greater5=list(filter(greaterthan5, lis))
print(greater5)
#-----------reduce-------REDUCE------------REDUCE-------------REDUCE-------
from functools import reduce
list1=[2,4,6,8,10]
num3=reduce(lambda x,y:x+y,list1)
print(num3)
