n_items=int(input("Enter no. of food items to add:"))
calorie=[]
for i in range(1,n_items+1):
    x=input(f"Enter calories for food item {i}:")
    calorie.append(x)
calorie.sort()
print(calorie)
print("************Now printing reverse order of calories**********")
print(calorie[::-1])
for i in range(0,n_items+1):
    for j in range(n_items-1,0):
        calorie[i]=calorie[j]
print(calorie)

        

