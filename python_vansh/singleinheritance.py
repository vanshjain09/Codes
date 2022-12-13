#to reduce the concept of code reusability
class btech:
    def __init__(self,name_student):
        self.name=name_student
    def get_details(self):
        print("the name of student is:",self.name)
vansh=btech("vansh jain")
vansh.get_details()
#now to add same properties to other class inheritance is used
class btechcse(btech):
    pass
rohan=btechcse("Rohan kumar")
rohan.get_details()
#New instances and variables is created in new class
#in constructor we can also add more arguement


