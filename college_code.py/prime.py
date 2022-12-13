n=int(input("Enter nunber :"))
factor=0
for i in range(1,n):
    if n%i==0:
        factor+=1
if n<0:
    print("Enter a valid number")
elif factor>=2:
    print("Number is not prime")
else:
    print("Number is prime")

        
