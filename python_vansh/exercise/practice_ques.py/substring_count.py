"""string=input("Enter String:")
sub_s=input("Enter sub String:")
list_string=[]
count=0
for i in range(0,len(string)-1):
    x=string[i]+string[i+1]
    list_string.append(x)
for j in list_string:
    if sub_s==j:
        count+=1
    else:
        continue
print(count)"""

s=input("Enter a string:")
new_s= s[0].upper()+s[1:]
new_s2=""
for i in range(0,len(new_s)):
    if new_s[i]==" ":
        new_s2= new_s[0:i+1]+new_s[i+1].upper()+new_s[i+2:]
print(new_s2)














