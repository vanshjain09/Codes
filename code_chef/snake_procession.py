r=int(input())
x=""
for i in range(r):
    l=int(input())
    s=input()
for i in s:
    if i=='H' or i=='T':
        x+=i
    elif i=='.':
        pass
if len(x)%2!=0:
    print("Invalid")
else:
    for i in range(0,len(x),2):
     if x[i]=='H':
        print("Valid")
        continue
     else:
        print("Invalid")
        break


