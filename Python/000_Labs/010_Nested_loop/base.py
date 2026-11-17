width = int(input("What width do you want?: "))
symbol = input("What symbol do you want to use?: ")
height = int(input("What height do you want?: "))
for i in range(height):
    for x in range(width):
        print(symbol, end="")
    print()
else:
        print("This is sad go to work")