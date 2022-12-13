f=open("vansh.txt","r")
print(f.tell())
print(f.readline())
print(f.tell())  #ftell function to tell the location of file pointer
print(f.readline())
print(f.tell())
f.seek(56)   #fseek fuction to reset the location of file pointer
print(f.readline())
f.close()