# python program to check a no. is pallindrome or not
#s1=input("Enter a string to check it is pallindrome or not:")
s1='ada'
"""l=len(s1)
i=0
j=0
while(i<=l-1 and i>=0):
    while(j<l):
        s1[j]=s1[i]
        i+=1
        j+=1
print(s1)"""
reversed_s1=s1[::-1]
if reversed_s1==s1:
    print("your string is pallindrime")
else:
    print("your str is not a pallindrome")
#Ways to remove i’th character from string in Python
s='vansh'
print(s[0:2]+s[3:5])
print(s.replace('n', ''))

#program to find length of a string
counter=0
for i in s:
    counter+=1
print(f"Length of String is {counter}")

#Python program to print even length words in a string

string='I am coder'
s2=string.split(' ')
for word in s2:
    if len(word)%2==0:
        print(word)
   


