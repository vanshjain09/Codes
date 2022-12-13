var2=56
var3=int(input("Enter a integer number"))
if var3>var2:
    print("Greater")
elif var3==var2:
    print("Number is equal")  #if-else ladder
else:
 print("Lesser")
 
 list=[1,2,3,"vansh"]
 if "vansh" in list :
     print("yes it is\n")
 else:
    print("not present")
    # also there is a keyword (not in)

age=int(input("Enter your age"))
if age<18:
    print("you can't get licence\n")
elif age==18:
    print("You come to office,we will decide\n")
elif age<7 or age>100:
    print("invalid age")
else:
    print("you are eligible for licence\n")


