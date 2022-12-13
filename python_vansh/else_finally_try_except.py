f1=open("vansh.txt")
try:
    f=open("open.txt")
except:
   print("Such file does not exist")
else:
    print("only run if except not execued")
#it is compulsory to write except block when else is written
finally:
    print("run this anyway")
    f1.close()
#whatever is the condition command
#in try except or anywhere finally block commands is executed
#it is basically used for code clean up

