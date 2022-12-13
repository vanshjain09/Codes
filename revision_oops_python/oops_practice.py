import math
class calculator:
    def __init__(self,number):
        self.number=number
    def function(self):
        print(f"Square of number is {self.number**2}")
        print(f"Cube of Number is {self.number**3} ")
        print(f"Square root of number is {math.sqrt(self.number)} ")
    @staticmethod
    def greet():
        print("Hello!,Your result is given below -->\n")

num1=calculator(7)
num1.greet()
num1.function()

