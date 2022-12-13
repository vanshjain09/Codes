#faulty calculator
operator=input("enter the operator(+,-,*,/)")
v1=int(input("enter the first number"))
v2=int(input("enter the second number"))
if operator=='+':
 if v1==56 and v2==9:
    print(77)
 else:
    print(v1+v2)
elif operator=='-':
 print(v1-v2)
elif operator=='*':
    if v1==45 and v2==3:
        print(555)
    else:
     print(v1*v2)
else:
    if v1==56 and v2==6:
        print(6)
    else:
     print(v1/v2)


    