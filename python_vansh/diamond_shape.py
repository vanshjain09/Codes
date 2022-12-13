class A:
    @staticmethod
    def info():
        print("this is method from class A")
class B(A):
    @staticmethod
    def info():
        print("this is method from class B")
class C(A):
    @staticmethod
    def info():
        print("this is method from class C")
class D(B,C):
    pass
    """@staticmethod
    def info():
        print("this is method from class D")"""
        
a=A()
b=B()
c=C()
d=D()
print(d.info())
