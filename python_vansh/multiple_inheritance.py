class Employee:
    def __init__(self,name,salary):
        self.name=name
        self.salary=salary
    def printinfo(self):
        print(f"Name of employee is {self.name},and salary is {self.salary}")
class Gamer:
    def __init__(self,name,game):
        self.name=name
        self.game=game
    def printinfo(self):
     print(f"Name of employee is {self.name},and game played  is {self.game}")  
class coolprog(Employee,Gamer) :#this order of parameters matters
    pass
harry=coolprog("Harry","13Lpa")
rohan=coolprog("Rohan", "6lpa")
    #as we write employee in inheritance first so it find constrructor of employee class first
print(harry.printinfo())
class coolprogx(Gamer,Employee):
    pass
vansh=coolprogx("vansh", "[bgmi,cricket]")
print(vansh.printinfo())