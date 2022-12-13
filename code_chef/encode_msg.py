t=int(input())
first_s=""
second_s=""
for i in range(t):
    n=int(input())
    s=input()
    if n%2==0:
        for i in range(0,n-1,2):
            first_s+=s[i+1]+s[i]
    elif n%2!=0:
        for i in range(0,n-2,2):
            first_s+=s[i+1]+s[i]
        first_s+=s[n-1]
    for i in first_s:
        second_s+=chr(122+97-ord(i))
    print(second_s)

    