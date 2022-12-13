while(True):
    print('what do you want  to do (lock or retrive?) :')
    inp=int(input("1 for lock \n2 for retreive\n"))
    inp1=int(input("1 for food\n2 for exercise\n"))
    inp2=int(input('1 for satyam \n2 for shreyes\n3 for mahesh\n'))
    if inp==1 and inp1==1 and inp2==1:
        with open('sat_food.txt','a') as f:
            inp3=int(input("enter number of items: "))
            for i in range (0,inp3):
                print("enter item ",i+1,':')
                item=input()
                f.write(item+'\n')
            print("succefully written")
    if inp==1 and inp1==1 and inp2==2:
        with open('shr_food.txt','a') as f:
            inp3=int(input("enter number of food item"))
            for i in range(0,inp3):
                print("enter food",i+1,':')
                item=input('')
                f.write(item+'\n')
            print('succefully writen')
    if inp==1 and inp1==1 and inp2==3:
        with open('mah_food.txt','a') as f:
            inp3=int(input("enter number of food :"))
            for i in range(0,inp3):
                print("enter food",i+1,':')
                item=input()
                f.write(item+'\n')
            print('successfully written')
    if inp==1 and inp1==2 and inp2==1:
        with open('sat_exe.txt','a') as f:
            inp3=int(input('enter number of exercises:'))
            for i in range(0,inp3):
                print('enter exercise',i+1,':')
                exe=input('')
                f.write(exe+'\n')
            print("successfully eritten")
    if inp==1 and inp1==2 and inp2==2:
        with open('shr_exe.txt','a') as f:
            inp3=int(input('enter number of exercises: '))
            for i in range(0,inp3):
                print("enter exercise ",i+1,':')
                exe=input()
                f.write(exe+'\n')
            print('succefully written')
    if inp==1 and inp1==2 and inp2==3:
        with open('mah_exe.txt','a') as f:
            inp3=int(input('enter number of exercise:'))
            for i in range(0,inp3):
                print('enter exercise ',i+1,':')
                exe=input()
                f.write(exe+'\n')
            print("succefully written")
    if inp==2 and inp1==1 and inp2==1:
        try:
            with open('sat_food.txt','r') as f:
                print(f.read())
        except:
            print("file not found")
    if inp==2 and inp1==1 and inp2==2:
        try:
            
            with open('shr_food.txt','r') as f:
                print(f.read())
        except:
            print("file not found")
    if inp==2 and inp1==1 and inp2==3:
        try:
            with open('mah_food.txt','r') as f:
                print(f.read())
        except:
            print('file not found')
    if inp==2 and inp1==2 and inp2==1:
        try:
            with open('sat_exe.txt','r')as f:
                print(f.read())
        except:
            print('file not found')
    if inp==2 and inp1==2 and inp2==2:
        try:
            with open('shr_exe.txt','r')as f:
                print(f.read())
        except:
            print("file not found")
    if inp==2 and inp1==2 and inp2==3:
        try:
            with open('mah_exe.txt','r')as f:
                print(f.read()) 
        except:
            print("file not found")