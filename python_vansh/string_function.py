s1="VANSH is a good boy"
print("\n",s1)
#string slicing
print(s1[0:5])
print(s1[0:5:2])      #this slicing is for skipping first character
#here 0 is including but 5 is excluding so vansh is printed from index 0-4
#length function
print("The length of string is :",end=" ")
print( len(s1))
#to check wheather a string is alphanumeric or not(if space bar =false) 
print(s1.isalnum())
#to check end word of string
print(s1.endswith("boy"))
#to check particular letter
print("The number of a in my string is :")
print(s1.count("a"))
#to capitalize the first character of string
print(s1.capitalize())
#to find a word in string
print(s1.find("good"))
#to lower case a string
print(s1.lower())
#to upper case a string
print(s1.upper())
#to replace a word in string
print(s1.replace("good", "OP"))
