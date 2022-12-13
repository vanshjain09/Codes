#list comprehension
#to print a list having numbers 0-100
ls=[i for i in range(10)]
print(ls)
#to print a list containing multiples of 3 from 0-100
lst=[i for i in range(101) if i%3==0]
print(lst)

#dictonary comprehension
dict1={i:f"item{i}" for i in range(10)}
print(dict1)
d2={"important":"jaruri","work":"kam","study":"padai"}
d1={key:value for key,value in d2.items()}
print(d1)
#how to reverse a dictionary
rev={ value:key for key,value in d2.items()}
print(rev)

#sets comprehensions we use {}
num={i for i in (1,2,3,4,1,2,3,4)}
print(num)
print(type(num))

#generator comprihension
#for generator we use ()
generator1=(i for i in range(100) if i%2==0)
for j in generator1:
  print(generator1.__next__())


# exersice 
n=int(input("Enter how many variables u want to enter:"))
choice=int(input("press--> 1 for list comprihension 2 for dictionary 3 for list:"))
if choice==1:
  list1=[]
for i in range(n+1):
        var=input("enter value->")
        list1.append(var)
  #list2=[i for i in list1]
print(list1)



