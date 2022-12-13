def increment(num):
 try:
     return int(num)+1
 except:
     raise ValueError('This error is raised by me !')
print(increment(9))
print(increment('gsv546'))
