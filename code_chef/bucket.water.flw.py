w,x,y,z=[int(i) for i in input().split()]
if w+y*z>x:
    print("overflow")
elif w+y*z<x:
    print("unfilled")
elif w+y*z==x:
    print("filled")
    

