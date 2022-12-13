def reversenum(number):
    revs_number = 0
    while (number > 0):  
        remainder = number % 10  
        revs_number = (revs_number * 10) + remainder  
        number = number // 10  
    return revs_number

list=[12,7,56,75]
list2=[]
for item in list:
    if item<10:
        list2.append(item)
    else:
        while item!=reversenum(item):
            item=item+1
        list2.append(item)
print(list2)


