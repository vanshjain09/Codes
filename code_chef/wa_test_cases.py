#https://www.codechef.com/START52D/problems/WATESTCASES
t=int(input())
for i in range(t):
    failed_cases=[]
    n=int(input())
    s= list(map(int, input().split()))
    v=input()
    for i in range(len(v)):
        if v[i]=='0':
            failed_cases.append(s[i])
    print(min(failed_cases))
    
