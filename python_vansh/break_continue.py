i=0
while(1) :
    print(i,end="  ")
    i = i +1 
    if(i==3):
     break     
    else:
        continue
#wap user only allowed to enter number less than 100

while(5) :
    var=int(input("\nenter the number"))
    if var>100:
        print("you entered more than 100\n")
        break
    else:
     print("try again\n")
     continue
    
