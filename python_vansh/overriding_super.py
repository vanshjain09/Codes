class A:
    classvar1="i am a variable in class a"
    def __init__(self):
        self.var1="I am in class a's constructor"
        self.classvar1="Instance in class a"
class B(A):
    classvar2="i am a variable in class b"
a=A()
b=B()
print(b.classvar1)
#basically! First priority is instance variable then goes to class var.
#here classvar1 is class and instance var. in class 1 and classvar2 is class var. of b class

#constructor is overwritted by giving same name and var. names  constructor in class b and then class a cons. is not valid
class C:
    var1="this is class var.of c class"
    def __init__(self):
        self.var12="this is class c constructor "
        self.special="special"
class D(C):
    var2="this is class var. of d class"
    def __init__(self):
        super().__init__()
        self.var12="this is class d constructor "
c=C()
d=D()
#print(d.special)
#as constructor of class c is overwritted it is not accessing 
# special with its instace so we use super
print(d.special)
print(d.var2)
        