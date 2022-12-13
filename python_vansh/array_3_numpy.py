from numpy import *
#in python to deal with 2d array we work in numpy
arr=array([1,2,3,4,5,6,7])
print(arr)
# linspace
arr=linspace(0,15,20) #20 is no. of steps
print(arr)
#arange
arr=arange(0,15,2)
#in this case 2 is step value
print(arr)
#logspace
arr=logspace(1,40,5)
print(arr) #it takes 1-40 as range and return log values and 5 is steps
#zeros
arr=zeros(40,int)
print(arr)
# if we want to take all the elements as 0 we are using zeros

#ones
arr=ones(40,int)
print(arr)


