def func(normal,*args,**kwargs):#this arguement name is whatever
    for i in args:
        print(i)
    for key,value in kwargs.items():
        print(f"{key} is {value}")
list=["harry","vansh","bot","ramu","harsh"]
normal="I AM NOT GETTING THIS"
kw={"harry":"monitor","vansh":"programmer","ramu":"cook"}
func(normal,*list,**kw)
