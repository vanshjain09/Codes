t=int(input())
sum=0
n=0
iteration=0
iteration2=0
for i in range(t):
    maXt,maXn,sumN=[int(i) for i in input().split()]
    for i in range(maXt):
        sum+=maXn
        n+=1
        if sum==sumN or sum>sumN:
            break
    for i in range(n):
        iteration+=maXn*maXn
    if sum>sumN:
        diff=sumN-sum+maXn
        iteration2=iteration-maXn*maXn+diff*diff           
        iteration=iteration2
    print(iteration)


            





