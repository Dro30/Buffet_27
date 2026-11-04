
year = int(input("Enter a year: "))
year = int(year)
if year % 100 != 0 and year % 400 != 0:
    print(str(year) + " It is NOT a leap year")
elif year % 4 !=0:
    print(str(year) + " It is NOT a leap year")
else:
    print(str(year) + " is  a leap year")
