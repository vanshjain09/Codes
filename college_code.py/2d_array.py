import numpy as np
def input_array(r,c):
    matrix=[]
    print("Enter values:")
    for i in range(r):
        a=[]
        for j in range(c):
            x=int(input())
            a.append(x)
        matrix.append(a)
    arry=np.array(matrix)
    return arry
arr1=input_array(3, 3)
arr2=input_array(3, 2)


