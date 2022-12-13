class Employee:
    company="google"
    def getsalary(self):
        print(f"salary is 100k")
    @staticmethod
    def greeting():
        print("Good day sir!")
harry=Employee()
harry.greeting()#this is running without self using static method 
harry.getsalary() #if seld is not given in function it says 1 positional arguement is given
# harry.getsalary()=employee.getsalary(harry)
 
"""agar ham kisi function k andar self nhi dena chate
  wo ek simple message h toh static method use karte h"""
