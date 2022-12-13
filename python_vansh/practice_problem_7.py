lst=["it is good","python is good","python is not python snake"]
query=input("Enter the words to search result:")
queryy=query.lower()
i=0
while(i<3):
    if queryy in lst[i]:
        print(f" Matching results are : {lst[i]}")
    else:
        print("No matching result found !")
    i+=1


    