import pandas as pd
# to change a particular value without getting a warning or error
data=pd.read_csv('dict.csv')
print(data)
data.loc[0,'marks']=100
print(data)

# to remove a whole column
#data.drop(name of coloumn,axis=1)

#when we need a particular coloumn with particular rows
print(data.loc[[0,1],['Student','marks']])

# to see all the rows
print(data.loc[:,['Student','marks']])
# to get all the columns
print(data.loc[[0,1],:])

# to filter out data with conditions
print(data.loc[(data['marks']>60)])

print(data.loc[(data['marks']>60) & (data['rank']>2)])



