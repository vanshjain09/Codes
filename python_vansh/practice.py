list=['h','e','l','l']
list.insert(4, 'o')
list.append("world")
print(list)
list.remove('world')
print(list)

t1=(1,2,3,4)
print(type(t1))
try:
     t1[1]=8
except Exception as e:
    print("sorry tupple can not be changed")

print(t1)
dic={"breakfast":"omellete","lunch":{"normally":"roti","weekends":"rice"},"dinner":"paneer"}
print(dic["lunch"]["weekends"])
dic["snacks"]="samosa"
print(dic)
dic.update({"snacks":{"normally":"samosa","weekends":"momos"}})
print(dic)

#wap to find factorial using functions
def fact(number):
     fctorial=1
     for i in range(1,number+1):
        fctorial=fctorial*i
        print(fctorial)
fact(5)
#taking input from user of a list
#a=[]
#for i in range(5):
  #   print("enter",i,"element of list")
  #   b=input()
  #   a.append(b)
#print(a)


#write a program to print all combination of 1,2,3

for i in range(1,4):
     for j in range(1,4):
          for k in range(1,4):
               if(i!=j and j!=k and k!=i):
                    print(i,j,k)
#can a while loop is nested in a for loop
for m in range(0,5):
     while m<3:
          print("i 3 se chota h\n")
          break
#what will be the output of this??
for index in range(20,10,-3):
     print(index,end='')