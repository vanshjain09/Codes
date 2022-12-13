t=int(input())
x="1"
i=0
while i!=t:
    n=int(input())
    for i in range(n-2):
        x+="0"
    x+="1"
    print(x)
    i+=1

    
