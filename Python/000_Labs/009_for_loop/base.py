code = int(input("Please enter line length: "))
line = input("Do you want it to be horizontal or vertical line: ")
num = 0

if line =="vertical" or line == "v":
    for i in range(code):
        print("*")
elif line == "horizontal" or line == "h":
    for i in range(code):
        print("*", end="")
else:
    print("Get to work")