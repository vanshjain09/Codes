list=["vansh","hello","world","harry"]
for item in list:
    print(item)
t1=("vansh","hello","world","harry")
for item in t1:
    print(t1)

#make a list and print that elements which is more than 6
items=["int","float","harry",2,44,55,66,77,1,3]
for item in items:
    if str(item).isnumeric() and item>6:
        print(item)
    else:
        break

#SYNTAX: for counter in range(initial value,final value,step value)
#print table of 3
    print("table of 3")
for i in range(1,11): 
    print("",3*i)
else:
    print("table printed")    
#for decrement the counter value
for i in range(10,0,-1):
    print("",i)