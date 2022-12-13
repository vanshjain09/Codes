n=int(input("Enter length of fibbocni:"))
a=0
b=1
for i in range(n//2):
    print(a)
    print(b)
    c=a+b
    b=b+c
    a=c


    