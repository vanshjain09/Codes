import random
def Diff(li1, li2):
    return list(set(li1) - set(li2)) + list(set(li2) - set(li1))
 
def fraudmultiply(Number):
    table=[]
    position=random.randint(0, 10)
    rand=random.randint(0, Number*10)
    for i in range(1,11):
        x=Number*i
        table.append(x)
    table[position]=rand
    return table
def orignaltable(Number):
    tab=[]
    for i in range(1,11):
        x=Number*i
        tab.append(x)
    return tab
print(f"Rohan's Table:{fraudmultiply(6)}") 
print(f"Vansh's Table:{orignaltable(6)}")
if fraudmultiply(6)==orignaltable(6):
    print("!!!!************Rohan method is also correct******************!!!!")
else:
    print("!!!!************Rohan has frauded the students*****************!!!!")
    #print(f"The wrong number asked was {Diff(fraudmultiply(6), orignaltable(6))}")




