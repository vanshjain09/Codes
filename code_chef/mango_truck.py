t=int(input())
for i in range(t):
    x,y,z=[int(i) for i in input().split()]
    n_mangoes=(z-y)//x
print(n_mangoes)

