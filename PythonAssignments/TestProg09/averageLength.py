x = input("enter first string: ")
y = input("enter second string: ")
z = input("enter third string: ")

len = float((len(x) + len(y) + len(z)) / 3.0)
print("the average length is:", '{:>5.2f}'.format(len))