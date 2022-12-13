f=open("vansh.txt","w")
f.write("vansh bhai ek good bgmi player h\n")
f.close()

f=open("vansh.txt","a")
k=f.write("jisme dam h 1v1 aajo\n")
print(k) #how many leeters are appended
f.close()

f=open("vansh.txt")
print(f.read())
f.close()
#to open a file with both read and write
f=open("vansh.txt","r+")
print(f.read())
f.write("yesterday i got vampire set \n")
f.close()