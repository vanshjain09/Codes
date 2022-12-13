dic={'address': 'Downtown', 'age': 27, 'name': 'Jack'}
print(type(dic))
c={44,55,66}
print(type(c))
def dic_reverse(**kwargs):
    for key,value in kwargs.items():
        print(f"Reversed dictionary is {value}={key}")
dic_reverse(**dic)

# *****args arguement {non keyword arguement}
ls=[2,3,4,5,6]
def square_list(*args):
    for i in args:
        print(i*i)
square_list(*ls)
