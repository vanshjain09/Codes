import pandas as pd
import numpy as np
# Creating a random data
data=pd.DataFrame(np.random.rand(5,5))
data.columns=['A','B','C','D','E']

# to access elements by name we use loc
#to access elements by index number we use iloc
print(data.iloc[0,2])

# when there is no sorting in index 
data.reset_index(drop=True)
print(data.head())
# a extra coloumn of index is created to remove it drop=true is used

#implace is used to change data changes permanently in orignal data

# to delete the duplicates
data2=pd.read_csv('dict.csv')
print(data2)
data2=data2.drop('Unnamed: 0',axis=1)
#data2.drop_duplicates(subset=['56'])
print(data2)




