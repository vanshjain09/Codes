# cook your dish here
def sum_lst(list):
    sum=0
    for i in range(len(list)):
        sum=sum+list[i]
    return sum
t=int(input())
for i in range(t):
    n=int(input())
    l=[]
    for i in range(n):
        x=int(input())
        l.append(x)
    for i in range(1,max(l)):
        #print(i)
        lst=[]
        for j in range(n):
            #print(j)
            lst.append(l[j]/i)
        print(lst)



    

        

        