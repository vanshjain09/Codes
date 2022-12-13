t=int(input("enter no. of test cases"))
on_initial,on_final=0,0
for i in range(t):
    n=int(input("no. of bulbs:"))
    s=input("initial:")
    r=input("final:")
    lst1=s.split()
    lst2=r.split()
    for i in lst1:
        if i==1:
            on_initial+=1
    for i in lst2:
        if i==1:
            on_final+=1
    if (on_final+on_initial)%2!=0:
        print(0)
    elif (on_final+on_initial==1 or on_final+on_initial==0 ):
        print(0)
    else:
        print(1)

   
    