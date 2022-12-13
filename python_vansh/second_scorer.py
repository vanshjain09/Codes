n=int(input("Enter number of students:"))
d={}
for i in range(n):
    name=input("enter name:")
    score=float(input("enter score:"))
    d.update({name:score})
lst=[value for key,value in d.items()]
mx=max(lst)
while mx in lst:
    lst.remove(mx)
lst.sort()
sec=max(lst)
lst2=[key for key,value in d.items() if value==sec]
lst2.sort()
print(lst2)








