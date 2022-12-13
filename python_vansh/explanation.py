#class method,static method ,abstract method
class Employee:
    no_employee=80
    @staticmethod
    def greet():
        print("Good morning sir!")
    @classmethod
    def change(cls,new_employee):
     cls.no_employee=new_employee
e1=Employee()
e1.change(90)
print(Employee.no_employee)
print(e1.greet())
from abc import ABC,abstractmethod
#abstract method let assume intro function is compulsary
class Programmer(ABC):
    def __init__(self,name,interest):
        self.name=name
        self.interest=interest
    @abstractmethod
    def intro(self):
        return 0
class tcs(Programmer):
    def info(self):
       print("i am working in tcs")
e1=tcs("vansh","ml")
e1.info()
print(e1.intro())

        



