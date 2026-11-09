uno = int(input("Please put an integer: "))
symbol = input("Please enter an operation(ex:-,+,*,/)")
dos = int(input("Please put a second integer: "))
if symbol == "+":
    print(uno+dos)
elif symbol == "-":
    print(uno-dos)
elif symbol == "/":
    print(uno/dos)
elif symbol == "*":
    print(uno*dos)
else:
    print("Please enter the proper operation")