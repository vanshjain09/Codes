n=int(input("Enter upto series goes:"))
a=0
b=1
sum=0
print(a)
print(b)
for i in range(n-1):
    sum=a+b
    print(sum)
    a=b
    b=sum

# Python program to display the Fibonacci sequence

def recur_fibo(n):
   if n <= 1:
       return n
   else:
       return(recur_fibo(n-1) + recur_fibo(n-2))

nterms = 2

# check if the number of terms is valid
if nterms <= 0:
   print("Plese enter a positive integer")
else:
   print("Fibonacci sequence:")
   for i in range(nterms):
       print(recur_fibo(i))

lst=['aa','bb','cc','dd']
l2=map(lambda llst:llst.join('**'), lst)
print(list(l2))


list2=[3,8,9,56,43,78,93]
even=filter(lambda x : x%2==0, list2)
odd=filter(lambda x : x%2!=0, list2)
print(list(odd))
print(list(even))

