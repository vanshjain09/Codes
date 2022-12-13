class Number:
    def __init__(self,num):
        self.num=num
    def __add__(self,num2):
        return self.num+num2.num
n1=Number(9)
n2=Number(99)
sum=n1+n2
print(sum)
