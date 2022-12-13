#From abc module we made metaclass 
#we use abstract method for base class
#for compulsory a method for all further class
from abc import ABC,abstractmethod
class shape(ABC):  #we can not allow to make objects from abstract class
    @abstractmethod
    def printarea(self):
        return 0
class rectangle(shape):
     def __init__(self,l,b):
        self.length=l
        self.breath=b
     def printarea(self):
        return self.length*self.breath
rec1=rectangle(7,9)
print(rec1.printarea())
class square(shape):
   def info(self):
      print("i am square")
sq1=square()
sq1.info() 


