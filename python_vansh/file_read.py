f=open("vansh.txt")
kuchbhi=f.read()
print(kuchbhi)  #printing or reading file content
f.close()
f=open("vansh.txt")
#in syntax of opening file ----> mode of file is secong arguement 
#as read mode is default no need to write it
for line in f:
  print(line,end="")   
f.close()
#for printing a single line another method
f=open("vansh.txt")
print(f.readline())
f.close()
#to store all lines in a list
f=open("vansh.txt")
print(f.readlines())
f.close()
