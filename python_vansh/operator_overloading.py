class btech:
    def __init__(self,name_student):
        self.name=name_student
    def get_details(self):
        return  f"the name of student is by simple method {self.name}"
    def __repr__(self):
        return f"the name of student is by repr suoer method:{self.name}"
    def __str__(self):
         return f"the name of student is {self.name}"
#add and true div also super method
o1=btech("Vansh Jain")
print(o1)
print(o1.__repr__())
print(o1.get_details())

class Student:
    no_student=50
    def __init__(self,m1,m2):
     self.m1=m1
     self.m2=m2
    def __add__(self):
        m1=self.m1+ self.m1
        m2=self.m2+ self.m2
        s3=Student(m1, m2)
        return s3
s1=Student(44,55)
s2=Student(66,11)
print(s1.__add__())



  