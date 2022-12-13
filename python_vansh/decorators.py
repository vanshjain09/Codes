#we can use function in function  
def func(num):
    if num==0:
        return print
a=func(0)
print(a)
#------------example--------------#
#WE CAN GIVE FUNCTION AS A ARGUEMENT IN FUNCTIONS
def executor(function):
    function("hello world")
executor(print)
#----------------------DECORATORS--------------------------

def deco(functio):
    print("executing now")
    functio()
    print("Executed")
@deco
def who_is_vansh():
    print("vansh is a good boy")

#*********one more example *******

def modifier(function):
    print("Welcome to Vansh's decorator!")
    function()
    print("Thank You for using , Keep making more Function !")
@modifier
def add():
    print("x+y")






    




