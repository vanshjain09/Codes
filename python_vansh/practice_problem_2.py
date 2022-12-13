n=int(input("Enter the number of apples harry have :"))
mn=int(input("Enter the minimum number of students in class:"))
mx=int(input("Enter the maximum number of students in class :"))
if mn==mx:
    print(f"{n/mn} apples is distributed along {mn} students")
else:
    for i in range(mn,mx+1):
        if n%i==0:
         print(f"{n/i} apples is distributed along {i} students")
        else:
            pass
    