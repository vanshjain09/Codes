#when a function call itself
'''def func(n):
    func(n)
    print(n)
func("vansh")''' #maximum recursion depth reached
#termination is required for recursions
def factorial(n):
    """FUNCTION TO FIND FACTORIAL"""
    if n==0 or n==1:
        return 1
    else :
        return n*factorial(n-1)
def fibbonacci(x):
    if x==0:
        return 0
    elif x==1:
        return 1
    else:
        return fibbonacci(x-1)+fibbonacci(x-2)

number=int(input("enter the number to find factorial"))
print(factorial(number))

number2=int(input("enter upto want to sum the fibbocani"))
print(fibbonacci(number2))
