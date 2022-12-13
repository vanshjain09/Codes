class btech:
    no_leaves=3 #here this is variable of classs
    pass
student1=btech()
student1.name="vansh"#this is instace variable
student2=btech()
student2.name="ramu"#this is instace variable
#we can access class variable by:
print(student1.no_leaves)
print(student2.no_leaves)
print(btech().no_leaves)
#but class variable is changed only by class name not by instance
student1.no_leaves=10 #this will not impact
print(student1.__dict__)
btech().no_leaves=10
print(student2.__dict__)
print(btech.__dict__)
