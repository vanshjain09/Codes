import pandas as pd
# to sort a given data ascending or descending
#by default ascending is true
data=pd.read_csv('dict.csv')
print(data.sort_index(axis=0,ascending=False))
# axis is 0 for rows and 1 for column

# view
data2=data
data2[0][2]=5   # this will do not exact copy of data in data2 as we can change data2 
print(data)     #data also changes

#copy function
data2=data.copy()
data2[0][1]=5
print(data)
print(data2)








