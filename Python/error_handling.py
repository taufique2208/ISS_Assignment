# 1. Try-except
try:
    result = 10 / 0
except ZeroDivisionError:
    print("Can't divide by zero!")

# 2. Else-finally
try:
    num = int("123")
except ValueError:
    print("Invalid input")
else:
    print("Conversion successful:", num)
finally:
    print("This always runs.")

# 3. Raise
def set_age(age):
    if age < 0:
        raise ValueError("Age cannot be negative")
    print(f"Age set to {age}")

set_age(20)
