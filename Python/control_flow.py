# 1. If-else
age = 18
if age >= 18:
    print("Adult")
else:
    print("Minor")

# 2. For loop
for i in range(3):
    print("Hello", i)

# 3. While loop
count = 0
while count < 3:
    print("Count:", count)
    count += 1

# 4. Break and Continue
for i in range(5):
    if i == 3:
        break
    if i == 1:
        continue
    print("Loop index:", i)

# 5. Pass
for i in range(3):
    if i == 1:
        pass  # placeholder
    print("i =", i)

# 6. Loop-else
for i in range(3):
    print(i)
else:
    print("Loop completed without break")
