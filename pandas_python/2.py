import pandas
data_read=pandas.read_csv('titanic.csv')
print(data_read)

print(data_read.describe())


#to get a particular column {to get age column}
print(data_read['age'])

#to get a particular element
print(data_read['age'][1])

#to change a particular value
data_read['age'][1]='child'
print(data_read['age'][1])

# this is how we update a csv file
data_read.to_csv('titanic.csv')

#to change the index of the given data
data=pandas.read_csv('dict.csv')
data.index=['first','second','third']
print(data)

# to change the column names
print(data.columns)
data.columns=['A','B','C','D']
print(data.columns)
print(data)


