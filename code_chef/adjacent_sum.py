t = int(input())
for i in range(t):
    n = int(input())
    a = []
    b = []
    a.append(1)
    for i in range(n):
        x = int(input())
        b.append(x)
    for i in range(n):
        if (a[i] == 1 and b[i] == 1) or (a[i] == 0 and b[i] == 0):
            a.append(0)
        elif (a[i] == 1 and b[i] == 0) or (a[i] == 0 and b[i] == 1):
            a.append(1)
    if a[n] != a[0]:
            print("NO")
    elif a[n] == a[0]:
        print("YES")
