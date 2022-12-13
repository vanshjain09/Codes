import pandas as pd
dict={"Student":["ram","shayam","vansh"]
     ,"marks":["85","56","90"]
     ,"rank":["2","3","1"]}

#to show the data in tabular form
data=pd.DataFrame(dict)
print(data)

#to export the data in excel or csv
data.to_csv('dict.csv')
#when we do not want index or serial number
data.to_csv('dict_index_false.csv',index=False)

#when data is bigger and we want few upper rows
print(data.head(2))
#when data is bigger and we want few lower rows
print(data.tail(2))

#to do mathematical analysis
print(data.describe())