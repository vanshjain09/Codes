class btech:
    no_leaves=10
#for changing class variable by instance variables we make class method
    @classmethod
    def change_leaves(cls,new_leaves):
     cls.no_leaves=new_leaves
vansh=btech()
vansh.change_leaves(12)
print(btech().no_leaves)

class bca:
    var1=9
    @classmethod
    def change(cls,var2):
      cls.var1=var2
sec1=bca()
sec1.change(99)
print(bca().var1)

class Student:
    no_students=50
    @classmethod
    def change_student(cls,new_student):
        cls.no_students=new_student
s1=Student()
s2=Student()
s1.change_student(60)#changed the class variable
print(Student().no_students)