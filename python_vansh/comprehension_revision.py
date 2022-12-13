#**********List comprehension***************
lst=[i for i in range(101)]
print(lst)

#*********dictionary comprehension***********
dic={"kam":"work","jaruri":"important","chusna":"suck"}
dic1={key:value for key,value in dic.items()}
print(type(dic1))
print(dic1)
dic2={f"bhai {key} ka matlab {value} hota h"for key,value in dic.items()}
print(type(dic2))
print(dic2)

#*****set comprehension**********
sett={1,1,2,2,3,3,5,5}
print(type(sett))
st={i for i in sett}
print(type(st))
print(st)




