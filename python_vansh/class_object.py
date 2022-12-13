import time
class employee:
    def get_data(data,n,id,dep):
        data.name=n
        data.identity=id
        data.department=dep
    def show_data(data):
        print(data.name,data.identity,data.department)
print("------------------enter data of 4 employee to add data------------------\n")

e=['1','2','3','4']
i=0

while(i<4):
 e[i]=employee()
 print("enter name of",i+1,"employee:")
 name=str(input())
 print("enter employee id of",i+1,"employee:")
 id=int(input())
 print("enter department of",i+1,"employee:")
 dep=str(input())
 e[i].get_data(name, id, dep)
 i+=1
 print("------------------------DATA TAKEN SUCCESSFULLY--------------------------")
time.sleep(5)
print("--------------------------DATA OF EMPLOYEES--------------------------------")
e[0].show_data()
e[1].show_data()
e[2].show_data()
e[3].show_data()
 
    
