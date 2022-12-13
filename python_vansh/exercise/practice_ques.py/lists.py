#Python program to interchange first and last elements in a list
l=['V','A','N','S','H']
len=0
for items in l:
    len+=1
print(len)
(l[0],l[len-1])=(l[len-1],l[0])
print(l)

# Python program to swap two elements in list
l2=['J','I','A','N']
a=input("Enter 1st element To swap:")
b=input("Enter 2nd element To swap:")
i1=int(l2.index(a))
i2=int(l2.index(b))
(l2[i1],l2[i2])=(l2[i2],l2[i1])

print(l2)

#maximum of two numbers in python
def maximum(n1,n2):
    if n1>n2:
        return n1
    else:
        return n2
print(maximum(-1, -4))




