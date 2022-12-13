t=int(input())
dolls=[]
for i in range(t):
    n=int(input())
    for i in range(n):
        x=int(input())
        dolls.append(x)
    for i in range(n):
        if dolls[i]*2>n:
            print(dolls[i])
            break
        else:
            continue
