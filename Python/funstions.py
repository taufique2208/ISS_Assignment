# 1. Parameters and arguments
def greet(name):
    print(f"Hello, {name}!")

greet("Taufique")

# 2. Return
def square(n):
    return n * n

print("Square of 5:", square(5))

# 3. Args and Kwargs
def show_args(*args, **kwargs):
    print("Args:", args)
    print("Kwargs:", kwargs)

show_args(1, 2, 3, name="Taufique", age=22)
