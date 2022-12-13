l1=["momos","burger","pizza","finger"]
#i=1
#for item in l1:
 #   if i%2 is not 0:
 #       print(item)
 #   i+=1
 #enumerate method to select particular even items
for index,item in enumerate(l1):
    if (index+1)%2==0 :
        print(item)
#******Map function
def func(a):
    return a+" is tasty"
lst=list(map(func, l1))
print(lst)
