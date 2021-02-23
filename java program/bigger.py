a=1
b=2

import math

if(a>b):
    print("a is bigger")
else:
    print("b is bigger")

s = 3.1

print(math.ceil(s))
print(math.floor(s))

name = "nayan parekk"
print(name.split(" "))


a,b=b,a
print("this is a ",a)
print("this is b ",b)

def square(h: int,l: int):
    return h*l

print(square("3",4))

print(dir(math))