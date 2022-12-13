class motorolla:
    no_models=10
    def __init__(self,model,ram):
        self.model=model
        self.ram=ram
    def info(self):
        print(self.model , self.ram)
    @classmethod
    def change(cls,no_models):
        cls.no_models=no_models
m1=motorolla('m1',4)
m1.colour='black'
m2=motorolla('m2',8)
m2.colour='red'
motorolla.info(m1)
m1.info()
print(m1.no_models)
motorolla.no_models=20  #class variable is changed by class name
m1.change(30) #here a new instance variable is formed
print(m1.no_models)
print(motorolla.no_models)



# methods static method,class method,abstract method





