t=int(input())
for i in range(t):
    x=int(input())
    final_pay=0
    if x<=100:
        final_pay=x
    elif x>100 or x<=1000:
        final_pay=x-25
    elif x>1000 or x<=5000:
        final_pay=x-100
    elif x>5000:
        final_pay=x-500
    print(final_pay)