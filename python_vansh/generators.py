"""iterable =__iter__(),__getitem__()
#if we use this method in object it provide/generate iterator
iterator=__next__()
iteration=
"""
def num(n):
    for i in range(n):
        yield i
#generator is being used to save the memory 
#it,s iteration is used when needed
g=num(4)
for i in g:
  print (i)

#generator program to find factorial of a number
def fact(n):
    
    for i in range(n,0):
        facto=i*n
    yield facto
ans=fact(5)
print(next(ans))
