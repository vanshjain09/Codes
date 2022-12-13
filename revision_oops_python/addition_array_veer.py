lst1=[]
x1=""
lst2=[]
x2=""

print("enter no. of elements for array 1 :")
n1=int(input())
print("enter no. of elements for array 2 :")
n2=int(input())
for i in range(n1):
    x=input()
    lst1.append(x)
print(lst1)
for i in range(n2):
    x=input()
    lst2.append(x)
print(lst2)
for i in lst1:
    x1+=i
for i in lst2:
    x2+=i
x=int(x1)+int(x2)
print(x)
lst3=[i for i in str(x)]
print(lst3)







    

