#sample input= xyyzaa
#output required= xy2za2
x=""
s=input("Enter a String:")
for i in s:
    count=s.count(i)
    if count>1:
        x=x+i+str(count)
    elif count==1:
        x=x+i
print(x)




