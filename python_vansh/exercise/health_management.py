def gettime():
    import datetime
    return datetime.datetime.now()

def lockfood(input2):
    if input2==1:
        f=open("rohanfood.txt","a")
        n_items=int(input("Enter number of items you want to lock:\n"))
        for i in range(n_items):
            f.write(input("Enter food item:\n"))
            time=str(gettime())
            f.write(time)
            print("written successfully")
    elif input2==2 :
        f=open("harryfood.txt","a")
        n_items=int(input("Enter number of items you want to lock:\n"))
        for i in range(n_items):
            f.write(input("Enter food item:\n"))
            time=str(gettime())
            f.write(time)
        print("written successfully")
    elif input2==3 :
        f=open("hammadfood.txt","a")
        n_items=int(input("Enter number of items you want to lock:\n"))
        for i in range(n_items):
            f.write(input("Enter food item:\n"))
            time=str(gettime())
            f.write(time)
        print("written successfully")
def lockexer(input2):
     if  input2==2:
        f=open("harryexer.txt","a")
        n_items=int(input("Enter number of exersice you want to lock:\n"))
        for i in range(n_items):
            f.write(input("Enter exersice:\n"))
            time=str(gettime())
            f.write(time)
        print("written successfully")
     elif  input2==1:
        f=open("rohanexer.txt","a")
        n_items=int(input("Enter number of exersice you want to lock:\n"))
        for i in range(n_items):
            f.write(input("Enter exersice:\n"))
            time=str(gettime())
            f.write(time)
        print("written successfully")
     elif  input2==3:
        f=open("hammadexer.txt","a")
        n_items=int(input("Enter number of exersice you want to lock:\n"))
        for i in range(n_items):
            f.write(input("Enter exersice:\n"))
            time=str(gettime())
            f.write(time)
        print("written successfully")
def retrievefood(input2):
    if input2==1:
        f=open("rohanfood.txt","r")
        print(f.readline())
    elif input2==2:
        f=open("harryfood.txt","r")
        print(f.readline())
    elif input3==3:
        f=open("hammadfood.txt","r")
        print(f.readline())
def retrieveexer(input2):
    if input2==1:
        f=open("rohanexer.txt","r")
        print(f.readline())
    elif input2==2:
        f=open("harryexer.txt","r")
        try:
         print(f.readline())
        except:
         print("No data to retrieve! Please add some\n")
    elif input3==3:
        f=open("hammadexer.txt","r")
        try:
         print(f.readlines())
        except: 
         print("No data to retrieve! Please add some\n")
            
print("---------HEALTH MANAGEMENT---------")
print("Press 1 for lock\n Press 2 for retrieve\n")
input0=int(input())
print("Press 1 for Rohan,2 for harry,3 for hammad\n")
input2=int(input())
print("Press 1 for food,2 for exersice\n")
input3=int(input())

if input0==1 and input3==1:
    lockfood(input2)
elif input0==1 and input3==2:
    lockexer(input2)
elif input0==2 and input3==1:
    retrievefood(input2)
elif input0==2 and input3==2:
    retrieveexer(input2)

