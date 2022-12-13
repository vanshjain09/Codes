#time module
import time
"""
# seconds passed since epoch
seconds=time.time()
local_time = time.ctime(seconds)
print("Local time:", local_time)"""
#write a program to check which is fast while loop are for loop
initial1=time.time()
k=0
while(k<10):
    print("Hello")
    k+=1
print("while loop ran in",time.time()-initial1,"seconds")
initial2=time.time()
for i in range(10):
    print("Hello")
print("for loop ran in",time.time()-initial2,"seconds")
