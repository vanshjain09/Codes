print("enter number of lines\n")
x=int(input())
print("enter your choice(0 or 1)\n")
y=int(input())
z=bool(y)
if z==True:
    for i in range(1,x+1):
        print()
        for j in range(1,i+1):
            print("*",end='')
elif z==False:
 for i in range(x,0,-1):
      for j in range(1,i+1,):
          print("*",end='')
      print()
            




