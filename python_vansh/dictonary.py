#dictonary is key value pairs
d1={} #declaration of dictionary
print(type(d1))
d2={"important":"jaruri","work":"kam","study":"padai"}
print(d2["important"]) 


#also we can give dictonary to dictonary
d3={"shubham":{"breakfast":"maggi","lunch":"roti","dinner":"chicken"}}
print(d3["shubham"]["lunch"])
#ALSO WE CAN ADD LATER 
d3["vansh"]="egg omlette"
d3["sanyam"]="paneer"
print(d3)
#to remove something in dictonary
del d3["vansh"]
print(d3)
d1=d3.copy()
del d3["sanyam"]
print(d1)
print(d3)
#to update a dictonary
d3.update({"leena":"toffe "})
print(d3)
print(d3.items())

