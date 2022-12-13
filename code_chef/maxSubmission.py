t=int(input())
for i in range(t):
    x=int(input())
    contest_sec=x*60
    n_submission=0
    while(contest_sec!=0):
        if contest_sec>5:
            n_submission+=1
            contest_sec-=30
        else:
            break
    print(n_submission)

