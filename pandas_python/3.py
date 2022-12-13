# two data structures----> series and dataframe
import pandas
import numpy as np
import random
# to generate a  series with random values
ser_data=pandas.Series(np.random.rand(20))
print(ser_data)

# to generate a  dataFrame with random values
data_frame=pandas.DataFrame(np.random.rand(5,3))
print(data_frame)
print(type(data_frame))

# to check the datatypes of all the coloumns
print(data_frame.dtypes)

# some function to analyze size of given data
print(data_frame.index)
print(data_frame.columns)

# to transpose the given data
print(data_frame.T)


