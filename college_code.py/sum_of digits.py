n=int(input("Enter a nunber:"))
sum=0
while(n!=0):
    rem=n%10
    print(rem)
    sum=sum+rem
    n=n//10
print(sum)

