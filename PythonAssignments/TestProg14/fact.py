def factorial(n, indent=0):
    if n <= 1:
        print('    '*indent + f"factorial({n})")
        print('    '*indent + "returns 1")
        return 1
    else:
        print('    '*indent + f"factorial({n})")
        result = n * factorial(n-1, indent+1)
        print('    '*indent + f"returns {n}*{result//n}={result}")
        return result

factorial(int(input("enter an integer: ")))