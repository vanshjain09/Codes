str=input("Enter a string:")
len=0
new_str=""
for i in str:
    len+=1
for j in range(len-1,-1,-1):
    x=str[j]
    new_str=new_str+x
print(new_str)
#slicing method
print(str[::-1])

