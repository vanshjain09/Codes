s=set()
print(type(s))
s_from_list=set([1,2,3,4])
print(s_from_list)
#to add element in set
s.add(1)
s.add(1)
print(s)  #set always add unique elements here 1 is added only 1 times
#also we can find union and intersection
s3=s.union(s_from_list)
print(s3)
s4=s.intersection(s_from_list)
print(s4)  