#function caching
import time
from functools import lru_cache
#lru cache is a decorator
@ lru_cache(maxsize=3)
def some_work(n):
    #some task taking n time
    time.sleep(n)
    print("...................")
    
if __name__=='__main__':
    print("now start")
    some_work(3)
    print("done.....calling again")
    some_work(3)
    print("called again")
#if we running a function again again it takes more time so 
#we store function using function caching for fast

@lru_cache(maxsize=4) #this maxsize mean it save only 4 call at a time
def ex():
    time.sleep(5)
    print("delay")
print("starting the function")
ex()
print("now this time no delay")
ex()
print("successfully used function cache")



