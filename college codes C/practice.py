""" sum of digit of a nmber
n=int(input("Enter the digit:"))
sum=0
while(n!=0):
    rem=n%10
    sum=sum+rem
    n=n//10
print(sum)"""


"""to print the fobbocni series
n=int(input("Enter length of fibbocni series:"))
a=0
b=1
c=0
print(a)
print(b)
for i in range(n-3):
    c=a+b
    b=b+c
    a=c
    print(a)
    print(b)"""

# to get the roots of quadratic equations
import math
a=int(input("Enter cofficient of x*x:"))
b=int(input("Enter cofficient of x:"))
c=int(input("Enter c :"))
d = b*b-4*a*c
print(d)
if d>0:
    r1=(-b+math.sqrt(d))/2*a
    r2=(-b-math.sqrt(d))/2*a
    print(r1)
    print(r2)
if d==0:
    r1= -b/2*a
    r2= -b/2*a
    print(r1)
    print(r2)
if d<0:
    print("roots are imaginery")





