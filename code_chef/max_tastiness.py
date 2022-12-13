t=int(input("enter no. of test cases:"))
tastiness,ig1,ig2=0,0,0
for i in range(t):
   a,b,c,d=[int(i) for i in input("enter four tastiness:").split()]
   if a>b:
    ig1=a
   else:
    ig1=b
   if c>d:
    ig2=c
   else:
    ig2=d
tastiness=ig1+ig2
print(tastiness)




