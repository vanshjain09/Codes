t=int(input())
vowel={'a','e','i','o','u'}
count=0
for i in range(t):
    n=int(input())
    s=input()
    for i in s:
        count+=1
        if i in vowel:
            count=0
    if count<=4:
        print("yes")
    elif n<4:
        print("yes")
    else:
        print("no")



