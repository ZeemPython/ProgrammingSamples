name = input("Please enter product name")
price = float(input("please enter product price"))
qt = int(input("Please enter qt"))
taxRate = (8.0 / 100)

tax = price * taxRate
subTotal = price + taxRate
totalPrice = qt * subTotal

print("For", qt, name, "your total is:", round(totalPrice, 2))