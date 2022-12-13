age=int(input("Enter your Age:"))
year=int(input("Enter Current Year:"))
if year>2022:
    print("!You are not born yet!")
elif age>100:
    print("You seems to be oldest person alive")
else:
    print(f"You age will be 100 years after {100-age} years.")
    print(f"You age will be 100 in year {year-age+100}.")
    year_check=int(input("Enter year in which you want to check your age: "))
    print(f"You will be {year_check-(year-age)} years old in year {year_check}")



