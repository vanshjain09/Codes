t=int(input())
for i in range(t):
    variable=[]
    countl=[]
    n=int(input())
    s=input()
    for i in s:
        if i in variable:
            pass
        else:
            variable.append(i)
    for i in range(len(variable)):
        count=0
        for j in range(n):
            if variable[i]==s[j]:
                count+=1
            else:
                pass
        countl.append(count)
    for i in range(len(countl)):
        flag=1
        if countl[i]%2!=0:
            flag=0
            break
        else:
            pass
    if flag==0:
        print("No")
    elif flag==1:
        print("Yes")

      



