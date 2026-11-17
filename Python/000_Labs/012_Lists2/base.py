import random
howmany = int(input("How many random would you like?: "))
numbers ={}
print("Your numbers are: ")
for i in range(0, howmany):
    numbers.append(random.randint(1,10))
print(numbers)