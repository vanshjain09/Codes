#a class is a blueprint of creating objects
class MovieBooking:
    def printdata(self):
        print(f"Name of person is {self.name} and movie's name is {self.movie}")
vansh=MovieBooking()
vansh.name="vansh jain"
vansh.movie="kgf 2"
vansh.printdata()
#atributes - class and instance atributes
#class atribute is changes only with class name
class Student:
    college="iit"
vansh=Student()
harry=Student()
harry.college="nit"
print(harry.college)#here is new instance variable is formed
#to change class variable 
Student.college="piet"
print(harry.college)
print(vansh.college)
#first instance attribute is checked then class atribute is checked
 
