#Public=access is public             private =only u see                 protected==access is  limited
#ghar ke bahar                          room ke andar                    home ke andar
#to declare a protected variable name started with underscore _
class btech:
    _noleaves=10 #declaration of protected variable 
    __private=98 #Declaration of private variable
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
print(btech._noleaves)
#Here no. of leaves is protected variable and only used in parent and derived class
print(btech._btech__private)     #name mangling done 
#to access private var. diff. syntax is used 
print(btechcse._btech__private)  




